package lote_21_30

fun main() {
    print("Digite um numero inteiro de tres casas: ")
    val numero = readLine()!!.trim().toInt()

    val dezena = (numero % 100) / 10

    println("Algarismo da casa das dezenas: $dezena")
}
