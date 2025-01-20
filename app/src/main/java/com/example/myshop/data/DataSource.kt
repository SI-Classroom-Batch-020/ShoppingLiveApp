package com.example.myshop.data



val itemList = listOf(
    Product("Saure Schlangen", "Box 1kg", 10.0),
    Product("Blaue Schlümpfe", "Box 1kg", 10.0),
    Product("Apfel", "Stück", 0.1),
    Product("Knusperflocken", "Packung, 250g", 3.0),
    Product("Apfelringe", "Box 1kg", 10.0),
    Product("Saure Pommes", "Box 1kg", 12.0),
    Product("Twinkie", "Riegel, 77g", 10.0),
    Product("Schoko Osterhase", "1 Hase, 100g", 3.0),
    Product("Saure Schlangen", "Box 1kg", 10.0),
    Product("Blaue Schlümpfe", "Box 1kg", 10.0),
    Product("Apfel", "Stück", 0.1),
    Product("Knusperflocken", "Packung, 250g", 3.0),
    Product("Apfelringe", "Box 1kg", 10.0),
    Product("Saure Pommes", "Box 1kg", 12.0),
    Product("Twinkie", "Riegel, 77g", 10.0),
    Product("Schoko Osterhase", "1 Hase, 100g", 3.0),
)

val angebotList = listOf(
    Product("Nugateier", "Packung 250g", 2.50),
    Product("Blaue Schlümpfe", "Box 1kg", 8.0),
)



var batch20List: List<String> = listOf(
    "Alex-Milos",
    "Alexander",
    "Andre",
    "Anton",
    "Cenk",
    "Cornelius",
    "Domenique",
    "Fabian",
    "Kai",
    "Katy",
    "Mario",
    "Markus",
    "Marvin",
    "Mihail",
    "Milan",
    "Sarina",
    "Sven",
    "Tobias",
)


fun main() {
    var temporaryList: MutableList<String> = batch20List.toMutableList()
    fun getName() {
        if (temporaryList.isNotEmpty()) {
            val randomName: String = temporaryList.random()
            temporaryList.remove(randomName)
            println(randomName)
        } else {
            println("List empty. Resetting...")
            temporaryList = batch20List.toMutableList()
        }
    }

    while (true) {
        println("Please press 1 to get a random Name")
        val userInput = readln().toInt()
        when {
            userInput == 1 -> getName()
        }


    }
}