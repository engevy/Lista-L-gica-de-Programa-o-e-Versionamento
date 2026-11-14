package lote_101_110

fun main() {
    print("Digite um número: ")
    val numero = readln().toDouble()
    when {
        numero > 20 -> println("Maior que 20")
        numero < 20 -> println("Menor que 20")
        else -> println("Igual a 20")
    }
}
