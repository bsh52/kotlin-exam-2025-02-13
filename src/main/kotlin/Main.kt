package com.ll

fun main() {
    val name: Any = "Kotlin"

    if (name is String) {
        println(name.length)
    }
}