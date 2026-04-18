package _2_OOP.corp

class Director(
    name: String,
    age: Int
) : Worker(name, age) {
    fun askCoffee(assistant: Assistant) {
        val drinkName: String = assistant.bringCoffe()
        println("Thank you, ${assistant.name}. $drinkName looks great.")
    }
    fun makeConsultantWork(consultant: Consultant) {
        val amount: Int = consultant.consult()
        println("Consultant ${consultant.name} served $amount clients.")
    }

    override fun work() {
        println("Drinking coffee..")
    }
}