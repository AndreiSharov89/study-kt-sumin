package KS13

fun main() {
//    val family = listOf<String>("Nikolay", "Galina", "Irina", "Andrei")
//    val person = family[3]
//    println(person)

    val daysOfMonth = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    print("Enter month number: ")
    val month = readln().toInt()
    if (month > 12 || month < 1) {
        println("Invalid month")
    } else {
        println("Days in your month: ${daysOfMonth[month - 1]}.")
    }
}