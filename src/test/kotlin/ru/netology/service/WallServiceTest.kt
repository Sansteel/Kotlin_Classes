package ru.netology.service

import org.junit.Test

import org.junit.Assert.*
import ru.netology.data.Post
import java.util.*

class WallServiceTest {

    @Test
    fun add() {
        // arrange
        val testPost1 = Post(
            id = 0,
            "Тестим",
            0,
            0
        )
        val testPost2 = Post(
            id = 1,
            "Once more text",
            1,
            1
        )
        val expextedPosts = listOf(testPost2, testPost1)
        // act
        WallService.add(testPost1)
        val actualResult = WallService.add(testPost2)

        // assert
        assertEquals(expextedPosts.last(), actualResult)
    }

//    @Test
//    fun add() {
//        // arrange
//        val testPost1 = Post(
//            id = 0,
//            "Тестим",
//            0,
//            0
//        )
//        // act
//        val actualPost = WallService.add(testPost1)
//        // assert
//        assertEquals(testPost1, actualPost)
//    }


    @Test
    fun update_true() {
        // arrange
        val testPost1 = Post(
            id = 12345,
            "Тестим",
            0,
            0
        )
        WallService.add(testPost1)

        val testPost2 = Post(
            id = 12345,
            "updated",
            0,
            0
        )
        WallService.update(testPost2)

        // act
        val actualResultUpd = WallService.update(testPost2)

        // assert
        assertEquals(true, actualResultUpd)
    }

    @Test
    fun update_false() {
        // arrange
        val testPost1 = Post(
            id = 12345,
            "Тестим",
            0,
            0
        )
        WallService.add(testPost1)

        val testPost2 = Post(
            id = 1234,
            "updated",
            0,
            0
        )
        WallService.update(testPost2)

        // act
        val actualResultUpd = WallService.update(testPost2)

        // assert
        assertEquals(false, actualResultUpd)
    }
}
