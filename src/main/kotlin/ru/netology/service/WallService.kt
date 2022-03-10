package ru.netology.service

import ru.netology.data.Post

class WallService {
    internal var posts = emptyArray<Post>() // пустой массив из постов

    fun add(post: Post): Post { //метод для создания записи должен выглядеть вот так (на вх и вых Post)
        posts += post //добавляем пост в наш массив
        return posts.last()
    }

    fun update(newPost: Post): Boolean {
        for ((index, oldPost) in posts.withIndex()) {
            if (oldPost.id == newPost.id) {
                posts[index] = newPost.copy(ownerId = oldPost.ownerId, date = oldPost.date)
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
