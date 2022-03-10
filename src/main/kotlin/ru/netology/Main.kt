package ru.netology

import ru.netology.data.*
import ru.netology.service.WallService


fun main() {
    val myService = WallService()

    val original = Post(
        id = 100,
        "это тестовый пост",
        12022022,
        12345,
        friendsOnly = false
    )
    myService.add(original)

    val newPost = Post(
        22,
        "второй пост",
        20022022,
        54321
    )
    myService.add(newPost)

    val thirdPOst = Post(
    333,
    "третий пост",
    20022022,
    54321
    )
    myService.add(thirdPOst)

    println("SYSTEM: Список постов \n")
    myService.print()

// добавляем коммент
    val commentToPost0 = CommentsObj(
        count = 1,
    )
    original.comments = commentToPost0

    println("SYSTEM: Список постов с комментами \n")
    myService.print()

//обновляем пост
    val originalUpdated = Post(
        333,
        "обновленный пост это",
        date = 21022022,
        12345,
    )
   var resultat = myService.update(originalUpdated)

    println("SYSTEM: Обновление поста с id=${originalUpdated.id} = $resultat \n")
    myService.print()
}