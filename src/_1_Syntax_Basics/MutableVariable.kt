package _1_Syntax_Basics

fun main() {
    var temprature = readln().toInt()
    var airConditionerIsOn = false
    repeat(100) {
        if (temprature > 25) {
            airConditionerIsOn = true
        } else if (temprature < 20) {
            airConditionerIsOn = false
        }

        if (airConditionerIsOn) {
            temprature--
        } else {
            temprature++
        }
        println("Current temprature is $temprature.")
    }

}