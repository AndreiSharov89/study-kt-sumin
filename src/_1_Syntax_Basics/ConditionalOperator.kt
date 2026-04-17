package _1_Syntax_Basics

fun main() {
    val temprature = readln().toInt()
    val hot: Boolean = temprature > 25
    val cold = temprature < 20
    if (hot) {
        println("The AC is on")
    } else if (cold) {
        println("The AC is off")
    } else {
        println("The AC is idle")
    }
}