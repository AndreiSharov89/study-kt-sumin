package KS9

fun main() {
    println("Enter first person age:")
    val first = readln().toInt()
    println("Enter second person age:")
    val second = readln().toInt()
    if (first > second) {
        println("First person is ${first - second} years older.")
    } else if (first < second) {
        println("Second person is ${second - first} years older.")
    } else {println("Ages are equal.")}
}