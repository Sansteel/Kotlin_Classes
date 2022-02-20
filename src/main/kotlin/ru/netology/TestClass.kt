package ru.netology

import ru.netology.data.CommentsObj

/** Тестовый класс для отработки навыков НЕ DATA */

public final class TestClass public constructor(
    //fixme start public constructor parameters
    public final val id: Int,
    val text: String,
    val friendsOnly: Boolean,
    //val comments: CommentsObj, // todo
    likes: Int = 0
    ) {
    init { //primary constructor logic
        println(
            "SYSTEM: primary constructor in TestClass initialized: id=$id, " +
                    "text=$text, likes=$likes, $friendsOnly"
        )
    }

    var likes: Int = likes
        get() {
            return field
        } //прячется под капотом
        set(value) {
            field = value
            println("Поле Likes установлено by default setter")
        }
}


data class DataTestClass(
    public final val id: Int,
    val text: String,
    val friendsOnly: Boolean,
//    val comments: CommentsObj, // todo
    var likes: Int = 0
) {
    init {
        println(
            "SYSTEM: primary constructor in DataTestClass initialized: id=$id, " +
                    "text=$text, likes=$likes, $friendsOnly"
        )//primary constructor
    }
}