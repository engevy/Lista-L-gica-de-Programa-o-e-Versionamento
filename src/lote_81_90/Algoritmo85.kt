package lote_81_90

fun main() {
    print("Digite o primeiro número: ")
    val a = readLine()!!.trim().toDouble()
    print("Digite o segundo número: ")
    val b = readLine()!!.trim().toDouble()
    print("Digite o terceiro número: ")
    val c = readLine()!!.trim().toDouble()
    val maior = if (a > b) {
        if (a > c) a else c
    } else {
        if (b > c) b else c
    }
    println("Maior número: $maior")
}
