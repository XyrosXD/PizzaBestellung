import kotlin.random.Random

fun main() {
    var geld = 100 // Startkapital
    println("Willkommen zum Kopf oder Zahl Spiel!")
    println("Du hast $geld Euro.")

    while (geld > 0) {
        println("Wie viel möchtest du setzen? (Aktueller Geldbetrag: $geld Euro, 'q' zum Beenden)")
        val input = readLine()

        if (input.equals("q", ignoreCase = true)) {
            // Beendet das Spiel bei drücken von q Taste
            println("Danke fürs Spielen! Du hast $geld Euro übrig.")
            break
        }

        val einsatz = input?.toIntOrNull()
        // Den Einsatz als Integer parsen

        if (einsatz == null || einsatz <= 0 || einsatz > geld) {
            // Ungültige Eingabe abfangen
            println("Ungültige Eingabe! Bitte gib einen gültigen Einsatz ein.")
            continue
        }

        val coin = Random.nextInt(2)

        if (coin == 0) {
            println("Kopf! Du gewinnst $einsatz Euro.")
            geld += einsatz
        } else {
            println("Zahl! Du verlierst $einsatz Euro.")
            geld -= einsatz
        }
    }
}