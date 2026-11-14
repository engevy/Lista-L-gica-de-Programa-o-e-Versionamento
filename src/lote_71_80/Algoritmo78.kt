package lote_71_80

fun main() {
    print("Digite o número de lados do polígono: ")
    val n = readLine()!!.toInt()
    val diagonais = n * (n - 3) / 2.0
    println("Número de diagonais: $diagonais")
}
