package com.bogarsoft.travelapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform