package _1_Syntax_Basics

fun main() {
    val numbers = 0..1_000_000_000L
//    var sum = 0L
//    for (number in numbers) {
//        sum += number
//    }
    println(numbers.sum())
}