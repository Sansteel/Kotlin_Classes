package ru.netology.attacments

class Video (
    val type: String = "video",
    val idP: Int, //Идентификатор
    val title: String, //Название видеозаписи
    val ownerId: Int, //Идентификатор владельца вложения
    val duration: Int, //Длительность ролика в секундах
    val text: String, //Текст описания вложения
    val date: Int, //Дата добавления в формате Unixtime
    val views: Int //Количество просмотров видеозаписи
    ) : Attachment(type, idP, ownerId) {

}