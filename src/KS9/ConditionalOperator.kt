package KS9

fun main() {
    val temprature = readln().toInt()
    if (temprature > 25) {
        println("The AC is on")
    } else if (temprature < 20) {
        println("The AC is off")
    } else {
        println("The AC is idle")
    }
}