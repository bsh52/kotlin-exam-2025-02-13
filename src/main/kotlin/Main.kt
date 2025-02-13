package com.ll

fun main() {
//    val num = 20;
//    var message = "Hello World"
//
//    println("num = $num")
//    println("message = $message")
//
//    val number = if (true) 10 else 20
//
//    for (i in 0 until 3) {
//        println("count : $i")
//    }
//
//    val result = add(5, 10)
//    println("result = $result")
//
//    val person1 = Person("Larry", 20)
//    person1.greet()

    val names = mutableListOf("Juli", "Ali", "Jan")

    names.add("Charlie")
    for (name in names) {
        println(name)
    }
}

//fun add(a: Int, b: Int): Int {
//    return a + b
//}
//
//class Person(val name: String, val age: Int) {
//    fun greet() {
//        println("Hello, $name, $age")
//    }
//}