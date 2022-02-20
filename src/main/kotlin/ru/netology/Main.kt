package ru.netology

import ru.netology.data.CommentsObj
import ru.netology.data.Post
import ru.netology.service.WallService


fun main() {

    var original = Post(
        id = (0..10_000).random(),
        "это тестовый пост",
        12022022,
        12345,
        friendsOnly = false
    )

    val newPost = Post(
        (0..10_000).random(),
        "второй пост",
        20022022,
        54321
    )

    val commentToPost0 = CommentsObj(
    count = 1,
    )

    WallService.add(original)
    WallService.add(newPost)

    WallService.print()

    original.comments = commentToPost0

    WallService.print()
}