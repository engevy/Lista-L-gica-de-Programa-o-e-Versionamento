package lote_61_70

fun main() {
    print("Altura da lata: ")
    val altura = readLine()!!.toDouble()
    print("Raio da lata: ")
    val raio = readLine()!!.toDouble()
    val volume = Math.PI * raio * raio * altura
    println("Volume da lata: $volume")
}
