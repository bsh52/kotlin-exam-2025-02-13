package com.ll

fun sayHello(name: String = "default") {
    println("Hello $name!")
}

fun main() {
    sayHello("Kotlin")
    sayHello()
}