package ru.netology

import ru.netology.data.CommentsObj
import ru.netology.data.Post
import ru.netology.service.WallService


fun main() {

    val original = Post(
        id = 100,
        "это тестовый пост",
        12022022,
        12345,
        friendsOnly = false
    )
    WallService.add(original)

//    val newPost = Post(
//        222,
//        "второй пост",
//        20022022,
//        54321
//    )
//    WallService.add(newPost)

    WallService.print()

// добавляем коммент
    val commentToPost0 = CommentsObj(
        count = 1,
    )
    original.comments = commentToPost0
    WallService.print()

//обновляем пост
    val originalUpdated = Post(
        100,
        "новый текст записан",
        date = 21022022,
        12345,
    )
    WallService.update(originalUpdated)

    println("Обновление поста с id ${original.id} выполнено")
    WallService.print()
}