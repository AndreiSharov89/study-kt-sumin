package _2_OOP.corp

open class Worker(
    val name: String,
    val age: Int = 0
) {
    open fun work() {
        println("I'm working.. ")
    }
}