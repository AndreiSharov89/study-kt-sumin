package _1_Syntax_Basics

fun main() {
    val daysOfWeekString = "Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday"
    val daysOfWeek = daysOfWeekString.split(", ")
    for (day in daysOfWeek) {
        println(day)
    }
}