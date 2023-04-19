import kotlin.random.Random

fun main() {
    val fishArten = listOf("Aal", "Hering", "Makrele", "Hecht", "Barsch", "Dose")
    val fishBox = mutableListOf<String>()
    var gefangeneFische = 0
    var gefangeneDosen = 0

    while (gefangeneFische < 10) {
        val randomFish = fishArten[Random.nextInt(fishArten.size)]
        if (randomFish != "Dose") {
            fishBox.add(randomFish)
            gefangeneFische++
            println("Gefangen: $randomFish")
        } else {
            gefangeneDosen++
            println("Gefangen: Dose")
        }
    }

    println("Gefangene Fische: $fishBox")
    println("Anzahl der gefangenen Dosen: $gefangeneDosen")
}