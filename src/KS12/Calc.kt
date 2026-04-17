package KS12

fun main() {
    print("Enter first number: ")
    val first = readln().toDouble()
    print("Enter sign (+, -, *, /): ")
    val sign = readln()
    print("Enter second number: ")
    val second = readln().toDouble()
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