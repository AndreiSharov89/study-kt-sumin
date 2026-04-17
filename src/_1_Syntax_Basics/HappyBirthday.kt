package _1_Syntax_Basics

fun main() {
    print("How old are you? ")
    val age = readln().toInt()
    repeat(age) {
        println("Happy Birthday!")
    }
}