package ks010

fun main() {
    print("The weather is good? true/false ")
    val isGoodWeather = readLine().toBoolean()
    print("What time is it? ")
    val time = readln().toInt()
    val isDay = time < 22 && time > 5
    val isNight = time >= 22 || time <= 5
    if (!isNight && isGoodWeather) {
        println("Go for a walk.")
    } else if (isDay) {
        println("Go read a book.")
    } else {
        println("Go to sleep.")
    }
}