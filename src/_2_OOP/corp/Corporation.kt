package _2_OOP.corp

fun main() {
    val director = Director("Andrei", 36)
    val assisatant = Assistant("Helen")
    val consultant = Consultant("Olga")
    val accountant = Accountant("Sergei")
    (director as Director).askCoffee(assisatant as Assistant)
    director.makeConsultantWork(consultant as Consultant)
    val employees = listOf<Worker>(director, assisatant, consultant, accountant)
    for (employee in employees) {
        employee.work()
    }
}