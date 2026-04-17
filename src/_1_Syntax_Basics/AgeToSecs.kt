package _1_Syntax_Basics

fun main() {
    print("Enter your age: ")
    val age = readln().toLong()
    println("It's ${age*365*24*60*60} seconds.")
}