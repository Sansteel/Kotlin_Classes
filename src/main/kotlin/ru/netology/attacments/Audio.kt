package ru.netology.attacments

class Audio(
    val type: String = "audio",
    val idP: Int, //Идентификатор
    val album_id: Int, //Идентификатор альбома, в котором находится фотография
    val ownerId: Int, //Идентификатор владельца фотографии
    val artist: String?, //Исполнитель
    val title: String?, //Название композиции
    val duration: Int? //Длительность аудиозаписи в секундах
) : Attachment(type, idP, ownerId) {

}