import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(EntityList::class.java)

    val module1 = SoftwareModule("Module 1", "Me", "C", "2022-02-02", 212, 3123,true)
    val module2 = SoftwareModule("Module 2", "Not me", "C++", "2022-03-01", 1231, 123123123,false)

    val product1 = SoftwareProduct("Product 1", "Developer 1", "1.0", "2022-01-01", 100, "64-bit", true, listOf(module1))
    val product2 = SoftwareProduct("Product 2", "Developer 2", "2.0", "2022-02-01", 200, "32-bit", false, listOf())
    val product3 = SoftwareProduct("Product 3", "Developer 3", "3.0", "2022-03-01", 300, "64-bit", true, listOf())
    val product4 = SoftwareProduct("Product 4", "Developer 4", "4.0", "2022-04-01", 400, "32-bit", false, listOf(module2))
    val product5 = SoftwareProduct("Product 5", "Developer 5", "5.0", "2022-05-01", 500, "64-bit", true, listOf(module1, module2))

    val productList = context.getBean(EntityList::class.java)
    productList.add(product1)
    productList.add(product2)
    productList.add(product3)
    productList.add(product4)
    productList.add(product5)

    val productFromList = productList.get(3)
    println(productFromList)

    productList.remove(4)
    println("Product with specified index has been removed from list.")

    val allProducts = productList.getAll()
    println("All products: $allProducts")
}
