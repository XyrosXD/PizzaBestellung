import kotlin.random.Random

// Erstelle ein Datenklasse für die Pizza
data class Pizza(val kreation: String)

fun main() {
    val pizzaHawaii = Pizza("Pizza Hawaii")
    val pizzaSalami = Pizza("Pizza Salami")
    val pizzaTonno = Pizza("Pizza Tonno")

    // verfügbare Pizzen
    val pizzaSortiment = listOf(pizzaHawaii, pizzaSalami, pizzaTonno)

    // Leere Mutable Liste für Bestellung
    val bestelltePizzen = mutableListOf<Pizza>()

    // Bestelle 100 random Pizzen aus dem Bestand
    repeat(100) {
        val zufälligePizza = pizzaSortiment[Random.nextInt(pizzaSortiment.size)]
        bestelltePizzen.add(zufälligePizza)
    }

    // Liste der bestellten Pizzen
    println("Bestellte Pizzen:")
    bestelltePizzen.forEach { println(it.kreation) }
}