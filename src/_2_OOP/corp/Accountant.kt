package _2_OOP.corp

class Accountant(name: String) : Worker(name) {
    override fun work() {
        while (true) {
            println("Enter the operation code: 0 - exit, 1 - register item: ")
            val code = readln().toInt()
            when (code) {
                0 -> break
                1 -> registerItem()
            }
        }
    }

    fun registerItem() {
        print("Enter product type. 0 - Food, 1 - Appliance, 2 - Shoes: ")
        val productType = readln().toInt()
        print("Enter product name: ")
        val name = readln()
        print("Enter product brand: ")
        val brand = readln()
        print("Enter product price: ")
        val price = readln().toInt()
        val product = when (productType) {
            0 -> {
                print("Enter calories: ")
                val caloric = readln().toInt()
                FoodCard(name, brand, price, caloric)
            }

            1 -> {
                print("Enter wattage: ")
                val wattage = readln().toInt()
                ApplianceCard(name, brand, price, wattage)
            }

            else -> {
                print("Enter size: ")
                val size = readln().toFloat()
                ShoesCard(name, brand, price, size)
            }
        }
        product.printInfo()
    }
}