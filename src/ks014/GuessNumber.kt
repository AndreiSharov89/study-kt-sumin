package ks014

import kotlin.random.Random

fun main() {
    val correctNumber = Random.nextInt(100)
    var win = false
    while (!win) {
        print("Enter number from 0 to 100: ")
        val number = readln().toInt()
        if (number < correctNumber) {
            println("Number is bigger")
        } else if (number > correctNumber) {
            println("Number is smaller")
        } else {
            win = true
            println("Your number is correct!")
        }
    }
}