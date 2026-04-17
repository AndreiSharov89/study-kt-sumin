package _1_Syntax_Basics

fun main() {
    val numbers = 0..1000 step 2
    val number = readln().toInt()
    val isEven = number in numbers
    println("Number $number is even: $isEven")
}