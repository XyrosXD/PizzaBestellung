fun main() {

    val filme = listOf("Blow", "Avangers", "Thor", "Smokin Aces", "Inception")

    println("\nAufgabe:1")

    for (title in filme.sorted()) {
        println(title)
    }
    println("\nAufgabe:2")

    for (title in filme.sorted().reversed()) {
        println(title)
    }

    println("\nAufgabe:3")

    val filteredTitles = filme.filter { it.contains("mo") }
    for (title in filteredTitles) {
        println(title)
    }
}