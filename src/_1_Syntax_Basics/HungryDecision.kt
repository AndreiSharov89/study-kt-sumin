package _1_Syntax_Basics

fun main() {
    println("Enter money amount: ")
    val money = readln().toInt()
    println("Are you hungry? true/false ")
    val isHungry = readln().toBoolean()
    if (isHungry && money > 500) {
        println("Go buy some pizza.")
    } else if (isHungry) {
        println("Go buy some noodles.")
    } else if (money > 500) {
        println("Go to cinema.")
    } else {
        println("Go for a walk.")
    }
}