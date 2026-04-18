package _2_OOP

fun main() {
    print("Input 1st name: ")
    val firstName = readln()
    print("Input 2nd name: ")
    val secondName = readln()
    print("Input 1st age: ")
    val firstAge = readln().toInt()
    print("Input 2nd age: ")
    val secondAge = readln().toInt()
    print("Input 1st height: ")
    val firstHeight = readln().toInt()
    print("Input 2nd height: ")
    val secondHeight = readln().toInt()
    print("Input 1st weight: ")
    val firstWeight = readln().toInt()
    print("Input 2nd weight: ")
    val secondWeight = readln().toInt()
    val first = Person(name = firstName, age = firstAge, height = firstHeight, weight = firstWeight)
    val second = Person(name = secondName, age = secondAge, height = secondHeight, weight = secondWeight)
    first.printIfo()
    second.printIfo()

    first.sayHello()
    second.sayHello()
    first.toRun()
}