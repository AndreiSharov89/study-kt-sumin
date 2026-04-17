package ks011

fun main() {
    var temprature = readln().toInt()
    var airConditionerIsOn = false
    if (temprature > 25) {
        airConditionerIsOn = true
    } else if (temprature < 20) {
        airConditionerIsOn = false
    }

    if (airConditionerIsOn) {
        temprature -= 5
    } else {
        temprature += 5
    }
    println("Current temprature is $temprature.")

    if (temprature > 25) {
        airConditionerIsOn = true
    } else if (temprature < 20) {
        airConditionerIsOn = false
    }
    if (airConditionerIsOn) {
        temprature -= 5
    } else {
        temprature += 5
    }
    println("Current temprature is $temprature.")
}