package _2_OOP

fun main() {
    val director = Director("Andrei", 36)
    val assisatant = Assistant("Helen")
    val consultant = Consultant("Olga")
    director.askCoffe(assisatant)
//    consultant.work()
    director.makeConsultantWork(consultant)
}