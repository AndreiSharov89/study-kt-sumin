package _2_OOP.corp

class ShoesCard(
    name: String,
    brand: String,
    price: Int,
    val size: Float
) : ProductCard(name, brand, price) {
    override fun printInfo() {
        super.printInfo()
        println(", Size: $size")
    }
}