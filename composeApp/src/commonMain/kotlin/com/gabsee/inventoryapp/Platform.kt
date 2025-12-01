package com.gabsee.inventoryapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform