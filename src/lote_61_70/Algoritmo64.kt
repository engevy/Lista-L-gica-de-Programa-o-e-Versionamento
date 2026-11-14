package lote_61_70

fun main() {
    print("Temperatura em graus Celsius: ")
    val celsius = readLine()!!.toDouble()
    val fahrenheit = (9.0 * celsius + 160.0) / 5.0
    println("Temperatura em Fahrenheit: $fahrenheit")
}
