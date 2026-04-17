package _1_Syntax_Basics

fun main() {
    println("Enter month name: ")
    val month = readln()
    val season = when(month) {
        "January", "February", "December" -> "Winter"
        "March", "April", "May" -> "Spring"
        "June", "July", "August" -> "Summer"
        "September", "November", "October" -> "Autmn"
        else -> ""
    }
    if (season == "") {
        println("You entered wrong month name: $month.")
    } else {
        println("You entered month $month. Its $season season.")
    }
}