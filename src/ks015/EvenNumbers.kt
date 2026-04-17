package ks015

fun main() {
    val numbers = listOf(1, 3939, 39422, 3949, 327, 2122, 490, 555550, 232, 192168, 17216, 255)
    for (number in numbers) {
        if (number % 2 == 0) {
            println("$number ")
        }
    }
}