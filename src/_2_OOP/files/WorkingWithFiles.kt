package _2_OOP.files

import java.io.File

fun main() {
//    val file = File("test.txt")
//    file.writeText("Hello, World!")
//    file.appendText("\nHello, World!")
    val taskList = File("src/_2_OOP/files/task-list.txt")
    val operationCodes = OperationCode.entries

    while (true) {
        print("Enter operation. ")
        for ((index, operation) in operationCodes.withIndex()) {
            print("$index - ${operation.title}")
            if (index < operationCodes.size - 1) {
                print(", ")
            } else print(": ")
        }
        val input = readln().toInt()
        val operation = operationCodes[input]
        when (operation) {
            OperationCode.EXIT -> break
            OperationCode.ADD_TASK -> {
                print("Add task: ")
                val task = readln()
                taskList.appendText(task + "\n")
            }
            OperationCode.SHOW_LIST -> {
                val lines = taskList.readLines()
                for ((index, task) in lines.withIndex()) {
                    print("${index + 1} - $task\n")
                }
            }
        }
    }
}