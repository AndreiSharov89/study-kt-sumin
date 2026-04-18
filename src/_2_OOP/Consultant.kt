package _2_OOP

import kotlin.random.Random

class Consultant(
    val name: String,
    val age: Int = 0
) {
    fun sayHello() {
        println("Hi, my name is $name.")
        if (age > 0) {
            println("Hi, my name is $name. I'm $age years old.")
        } else {
            println("Hi, my name is $name.")
        }
    }

    fun work(): Int {
        val clients: Int = Random.nextInt(100)
        repeat(clients) {
            print("Consulting client.. ")
        }
        println()
        return clients
    }
}