package com.gabsee.inventoryapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.gabsee.inventoryapp.app.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "inventoryapp",
    ) {
        App()
    }
}