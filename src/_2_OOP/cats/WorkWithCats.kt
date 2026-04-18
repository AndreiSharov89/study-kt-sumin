package _2_OOP.cats

fun main() {
    val cat = Cat("Sydney")
    println(cat.legsCount)
    println(cat.name)
    cat.playWithMouse()
    val leo = Lion(30)
    println(leo.legsCount)
    println(leo.prideSize)
}