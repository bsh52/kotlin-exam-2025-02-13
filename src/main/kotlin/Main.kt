package com.ll

fun main() {
    val person1 = Person("Alice", 25)

    println(person1)

    val person2 = Person("Alice", 25)

    if (person1 == person2) {
        println("ok")
    }
}

data class Person(val name: String, val age: Int)