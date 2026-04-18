package _2_OOP.gui

class Rectangle(
    val width: Int = 0,
    val length: Int = 0
) {
    constructor(size: Int) : this(size, size)

    fun draw() {
        repeat(width) {
            repeat(length) {
                print(" * ")
            }
            println()
        }
    }
}