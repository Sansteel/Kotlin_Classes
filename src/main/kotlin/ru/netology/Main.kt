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

    val newPost = Post(
        22,
        "второй пост",
        20022022,
        54321
    )
    WallService.add(newPost)

    val thirdPOst = Post(
    333,
    "третий пост",
    20022022,
    54321
    )
    WallService.add(thirdPOst)

    println("SYSTEM: Список постов \n")
    WallService.print()

// добавляем коммент
    val commentToPost0 = CommentsObj(
        count = 1,
    )
    original.comments = commentToPost0

    println("SYSTEM: Список постов с комментами \n")
    WallService.print()

//обновляем пост
    val originalUpdated = Post(
        333,
        "новый текст записан",
        date = 21022022,
        12345,
    )
   var resultat = WallService.update(originalUpdated)

    println("SYSTEM: Обновление поста с id=${originalUpdated.id} = $resultat \n")
    WallService.print()
}