package kotlinactivity
fun main() {
    val groceries = initializeGroceries() // Initialize the grocery items with their names and prices
    val cart = mutableListOf<String>() // Create an empty list to store the items in the cart
    var totalItems = 0 // Variable to keep track of the total number of items in the cart
    var totalPrice = 0.0 // Variable to keep track of the total cost of items in the cart

    // Loop to add items to the cart
    while (true) {
        println("Enter the item you want to add to the cart: ")
        val input = readln() // Read user input

        if (input == "done") {
            break // Exit the loop if the user enters 'done'
        }

        val item = groceries[input] // Get the item details from the groceries map
        if (item != null) {
            cart.add(item.first) // Add the item name to the cart
            totalItems++
            totalPrice += item.second // Add the item price to the total price
            println("$input added to the cart.")
        } else {
            println("Invalid item. Please try again.")
        }
    }

    println("\nItems bought:")
    for (item in cart) {
        println("- $item") // Print the items in the cart
    }
    println("Total items: $totalItems")
    println("Total cost: ${"%.2f".format(totalPrice)}") // Print the total cost with 2 decimal places
}

// Function to initialize the groceries map with item names and prices
fun initializeGroceries(): Map<String, Pair<String, Double>> {
    val groceries = mutableMapOf<String, Pair<String, Double>>()

    // Fresh Vegetables
    groceries["eggplant"] = Pair("Eggplant", 2.5)
    groceries["baguioBeans"] = Pair("Baguio Beans", 3.0)
    groceries["potato"] = Pair("Potato", 1.8)
    groceries["cabbage"] = Pair("Cabbage", 2.0)
    groceries["carrots"] = Pair("Carrots", 1.5)
    groceries["onionLeeks"] = Pair("Onion Leeks", 2.2)
    groceries["ginger"] = Pair("Ginger", 2.8)
    groceries["garlic"] = Pair("Garlic", 1.0)
    groceries["kangkong"] = Pair("Kangkong", 1.3)
    groceries["broccoli"] = Pair("Broccoli", 3.5)

    // Fresh Fruits
    groceries["papaya"] = Pair("Papaya", 4.0)
    groceries["pear"] = Pair("Pear", 2.5)
    groceries["apple"] = Pair("Apple", 3.0)
    groceries["calamansi"] = Pair("Calamansi", 1.2)
    groceries["mango"] = Pair("Mango", 2.8)
    groceries["kiwi"] = Pair("Kiwi", 4.5)
    groceries["grapes"] = Pair("Grapes", 3.5)
    groceries["banana"] = Pair("Banana", 1.2)
    groceries["ponkan"] = Pair("Ponkan", 2.5)
    groceries["watermelon"] = Pair("Watermelon", 5.0)


    // Meat and Seafood
    groceries["pork adobo"] = Pair("Pork adobo Cut", 6.5)
    groceries["chicken wings"] = Pair("Chicken Wings", 4.5)
    groceries["ground pork"] = Pair("Ground Pork", 5.0)
    groceries["beef ox"] = Pair("Beef Ox", 8.0)
    groceries["pork rib"] = Pair("Pork Rib Shoulder", 7.0)
    groceries["chicken breast"] = Pair("Chicken Breast Fillet", 6.0)
    groceries["shrimp"] = Pair("Shrimp", 9.0)
    groceries["squid"] = Pair("Squid", 5.5)

    //Dairy and Eggs
    groceries["egg"] = Pair("egg",7.5)
    groceries["Milk"] = Pair("Milk",35.55)
    groceries["Yogurt"] = Pair("Yogurt",25.65)
    groceries["margarine"] = Pair("margarine",32.50)
    groceries["Butter"] = Pair("Butter",15.35)
    groceries["Cheese"] = Pair("Cheese",19.55)
    groceries["purpose cream"] = Pair("purpose cream",25.65)
    groceries["whip cream"] = Pair("whip cream",55.55)
    groceries["yakult"] = Pair("yakult",10.00)
    groceries["delight"] = Pair("delight",10.00)


    //Beverages
    groceries["Tang"] = Pair("Tang",7.50)
    groceries["Swiss Miss"] = Pair("Swiss Miss",7.5)
    groceries["Vitamilk"] = Pair("Vitamilk",7.5)
    groceries["Nescafe Coffee Classic"] = Pair("Nescafe Coffee Classic",10.35)
    groceries["Milo"] = Pair("Milo",8.5)
    groceries["Gatorade"] = Pair("Gatorade",28.50)
    groceries["Zesto"] = Pair("Zesto",15.50)
    groceries["Mogu Mogu"] = Pair("Mogu Mogu",18.55)
    groceries["Coca-Cola"] = Pair("Coca-Cola",15.95)
    groceries["Sprite"] = Pair("Sprite",15.95)


    return groceries
}
