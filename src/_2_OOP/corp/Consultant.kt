package _2_OOP.corp

import kotlin.random.Random

class Consultant(
    name: String,
    age: Int = 0
) : Worker(name, age) {
    fun sayHello() {
        println("Hi, my name is $name.")
        if (age > 0) {
            println("Hi, my name is $name. I'm $age years old.")
        } else {
            println("Hi, my name is $name.")
        }
    }

    fun consult(): Int {
        val clients: Int = Random.nextInt(100)
        repeat(clients) {
            print("Consulting client.. ")
        }
        println()
        return clients
    }
    override fun work() {
        println("Consulting..")
    }
}