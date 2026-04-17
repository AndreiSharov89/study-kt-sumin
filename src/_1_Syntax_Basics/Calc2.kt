package _1_Syntax_Basics

fun main() {
    print("Enter what to count (with spaces): ")
    val data = readln().split(" ")
    val first = data[0].toDouble()
    val sign = data[1]
    val second = data[2].toDouble()
    var result = 0.0

    if (sign == "+") {
       result = first + second
    } else if (sign == "-") {
        result = first - second
    } else if (sign == "*") {
        result = first * second
    } else if (sign == "/") {
        result = first / second
    }
    println("Result = $result")
}