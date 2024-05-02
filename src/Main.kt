//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {

    val store = Store()

    store.addPreferences("audi")
    val preferredItem = "audi"
    store.recommendations(preferredItem)
}
class Store (){


    var cars = mutableListOf("prado","toyota", "audi")
    var furnitures = mutableListOf("stools","beds", "couches")
    var groceries = mutableListOf("vegetables","fruits", "refreshments")


    var userPreferences = mutableListOf<String>()
    fun addPreferences(item:String){
        userPreferences.add(item)
    }
    fun recommendations(item: String){
        if (item in cars){
            println(cars)
        }
        else if (item in furnitures){
            println(furnitures)
        }
        else {
            println(groceries)
        }

    }
}