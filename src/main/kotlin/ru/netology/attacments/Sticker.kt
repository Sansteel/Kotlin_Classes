package ru.netology.attacments

class Sticker(
    val type: String = "Sticker",
    val product_id: Int, //Идентификатор набора
    val sticker_id: Int, //Идентификатор стикера
    val ownerId: Int, //Идентификатор владельца фотографии
    val images: Array<Image>,
    val animation_url: String, //URL анимации стикера
    val isAllowed: Boolean //Информация о том, доступен ли стикер
) : Attachment(type, sticker_id + product_id, ownerId) {

    class Image(
        val url: String,
        val width: Int,
        val height: Int,)

}
