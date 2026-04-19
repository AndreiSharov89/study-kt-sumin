package _2_OOP.corp

class Accountant(name: String) : Worker(name) {
    val items = mutableListOf<ProductCard>()
    override fun work() {
        while (true) {
            val operationTypes = OperationType.entries
            print("Enter the operation code: ")
            for ((index, operation) in operationTypes.withIndex()) {
                print("$index - ${operation.title}")
                if (index < operationTypes.size - 1) {
                    print(", ")
                } else {
                    print((": "))
                }
            }
            val code = readln().toInt()
            val operationType = operationTypes[code]
            when (operationType) {
                OperationType.EXIT -> break
                OperationType.REGISTER_NEW_ITEM -> registerItem()
                OperationType.SHOW_ITEMS -> showProducts()
            }
        }
    }

    fun registerItem() {
        val productTypes = ProductType.entries
        print("Enter product type. ")
        for ((index, type) in productTypes.withIndex()) {
            print("$index - ${type.title}")
            if (index < productTypes.size - 1) {
                print(", ")
            } else {
                print((": "))
            }
        }
        val productTypeIndex = readln().toInt()
        val productType = productTypes[productTypeIndex]
        print("Enter product name: ")
        val name = readln()
        print("Enter product brand: ")
        val brand = readln()
        print("Enter product price: ")
        val price = readln().toInt()
        val product = when (productType) {
            ProductType.FOOD -> {
                print("Enter calories: ")
                val caloric = readln().toInt()
                FoodCard(name, brand, price, caloric)
            }

            ProductType.APPLIANCE -> {
                print("Enter wattage: ")
                val wattage = readln().toInt()
                ApplianceCard(name, brand, price, wattage)
            }

            ProductType.SHOES -> {
                print("Enter size: ")
                val size = readln().toFloat()
                ShoesCard(name, brand, price, size)
            }
        }
        items.add(product)
        product.printInfo()
    }

    fun showProducts() {
        for ((index, product) in items.withIndex()) {
            print("$index - ")
            product.printInfo()
        }
    }
}