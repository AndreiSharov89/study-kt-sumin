package ks012

fun main() {
//    val countOfApples: Float = 10f
//    val countOfPersons: Float = 4f
//    val result = countOfApples / countOfPersons
//    println(result)

    print("Enter 1st person age: ")
    val firstAge = readln().toInt()
    print("Enter 2nd person age: ")
    val secondAge = readln().toInt()
    print("Enter 3rd person age: ")
    val thirdAge = readln().toInt()
    println("Average age = ${(firstAge + secondAge + thirdAge) / 3.0}")
}