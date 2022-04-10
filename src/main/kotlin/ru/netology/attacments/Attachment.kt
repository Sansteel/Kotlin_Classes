package ru.netology.attacments

abstract class Attachment(
    val attType: String, //тип вложения
    //ArrayList1<String> = arrayListOf<String>("photo","video","music") //почему то не работает
    val id: Int, //Идентификатор юзера
    val owner_id: Int, //Идентификатор владельца вложения

) {

    fun print() {
        println("Вложение: $attType")
    }
}

