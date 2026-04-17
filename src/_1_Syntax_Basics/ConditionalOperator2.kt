package _1_Syntax_Basics

fun main() {
    val index = readln().toInt()
    val month = when (index) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> ""
    }
    if (index in 1..12) {
        println("You entered index $index, which corresponds to the month of $month.")
    } else {
        println("You entered index $index. There is no month with such an index.")
    }
}