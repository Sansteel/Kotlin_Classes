package ru.netology.service

import ru.netology.data.Post

object WallService {
    internal var posts = emptyArray<Post>() // пустой массив из постов

    fun add(post: Post): Post { //метод для создания записи должен выглядеть вот так (на вх и вых Post)
        posts += post //добавляем пост в наш массив
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (postik in posts) {
            if (postik.id == post.id) {
                posts += postik.copy(text = post.text)
                return true
            }
        }
        return false
    }

    fun print() {
        for ((index, post) in posts.withIndex()) {
            println("Пост ${index + 1}: id=" + posts[index].id)
            println("text=" + posts[index].text)
            println("owner id=" + posts[index].ownerId)
            println("Комментов=" + posts[index].comments?.count + "\n")
        }
    }
}
