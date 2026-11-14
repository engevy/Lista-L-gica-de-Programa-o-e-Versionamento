package lote_111_120

fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    var maior = a
    if (b > maior) maior = b
    if (c > maior) maior = c
    println("Maior: $maior")
}
