package KS8

fun main() {
    val seconds = readln().toInt()
    val hours = seconds / 3600
    val minutes = (seconds % 3600) / 60
    val leftSeconds = (seconds % 3600) % 60
    println("$hours:$minutes:$leftSeconds")
}