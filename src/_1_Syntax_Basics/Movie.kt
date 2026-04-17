package _1_Syntax_Basics

fun main() {
    print("How old are you? ")
    var age = readln().toInt()
//    repeat (18 - age) {
//        println("Wait one year")
//    }
    while (age < 18) {
        println("Wait one year")
        age++
    }
    println("You can watch horror movie.")
}