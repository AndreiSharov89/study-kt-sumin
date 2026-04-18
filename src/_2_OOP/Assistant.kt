package _2_OOP

class Assistant(val name: String) {

    fun bringCoffe(count: Int = 1, drink: String = "Cappuccino"): String {
        println("Get up.")
        println("Go to coffee machine.")
        repeat(count) {
            println("Press \"$drink\" button.")
            println("Wait for $drink to be prepard.")
            println("Take coffee.")
            println("Bring coffee to the director.")
            println("Put coffee on the table.")
        }
        println("Reeturn to the workplace.")
        return drink
    }
}