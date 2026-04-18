package _2_OOP

class Director(
    val name: String,
    val age: Int
) {
    fun askCoffe(assistant: Assistant) {
        val drinkName: String = assistant.bringCoffe()
        println("Thank you, ${assistant.name}. $drinkName looks great.")
    }
    fun makeConsultantWork(consultant: Consultant) {
        val amount: Int = consultant.work()
        println("Consultant ${consultant.name} served $amount clients.")
    }
}