package _1_Syntax_Basics

fun main() {
    println("Enter password:")
    val pass = readln().toCharArray()
    var hasNumber = false
    var hasLetter = false
    var hasSymbol = false
    for (char in pass) {
        if (char.isLetter()) {
            hasLetter = true
        }
        if (char.isDigit()) {
            hasNumber = true
        }
        if (!char.isLetterOrDigit()) {
            hasSymbol = true
        }
    }
    if (pass.size > 7 && hasNumber && hasSymbol && hasLetter) {
        println("Your password is strong.")
    } else {
        println("Your password is weak.")
    }
}