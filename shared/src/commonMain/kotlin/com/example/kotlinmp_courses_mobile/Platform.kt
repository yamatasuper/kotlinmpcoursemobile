package com.example.kotlinmp_courses_mobile

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform