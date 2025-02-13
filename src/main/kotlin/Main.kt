package com.ll

fun String.greet() :String {
    return "Hello $this"
}

fun main() {
    println("Jay".greet())
}