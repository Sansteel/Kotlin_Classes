package ru.netology.service

import org.junit.Test

import org.junit.Assert.*
import ru.netology.data.Post

class WallServiceTest {

    @Test
    fun add() {
        // arrange
        val testPost = Post(
            id = 0,
            "Тестим",
            0,
            0)
            val expextedPosts = testPost
        // act
        val actualPosts = WallService.add(testPost)
        // assert
        assertEquals(expextedPosts, actualPosts)
    }

    @Test
    fun update() {

    }
}