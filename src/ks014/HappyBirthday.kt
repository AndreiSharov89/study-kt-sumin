package ks014

fun main() {
    print("How old are you? ")
    val age = readln().toInt()
    repeat(age) {
        println("Happy Birthday!")
    }
}