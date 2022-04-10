package ru.netology

import ru.netology.attacments.Attachment
import ru.netology.attacments.*
import ru.netology.data.*
import ru.netology.service.WallService


fun main() {
    val myService = WallService()

    val original = Post(
        id = 100,
        "это тестовый пост",
        12022022,
        12345,
        friendsOnly = false,
        likes = null,
        reposts = null,
        attachermnts = null,
        views = null,
        original = null
    )
    myService.add(original)

    val newPost = Post(
        22,
        "второй пост",
        20022022,
        54321,
        likes = null,
        reposts = null,
        attachermnts = null,
        views = null,
        original = null
    )
    myService.add(newPost)

//    println("SYSTEM: Список постов \n")
//    myService.print()

// добавляем коммент в пост original
    val commentToPost0 = CommentsObj(
        count = 1,
    )
    original.comments = commentToPost0

    println("SYSTEM: Список постов с комментами \n")
    myService.print()

    val originalUpdated = Post(
        22,
        "второй пост",
        20022022,
        54321,
        likes = null,
        reposts = null,
        attachermnts = Audio(
            "audio", 1112233, 123,333, null, null, 10),
        views = null,
        original = null
    )
    myService.update(originalUpdated)

    myService.print()
}