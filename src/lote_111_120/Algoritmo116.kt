package lote_111_120

fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    val maior = if (a > b) { if (a > c) a else c } else { if (b > c) b else c }
    println("Maior: $maior")
}
