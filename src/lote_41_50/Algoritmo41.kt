package lote_41_50


fun main() {
    print("Entre com o primeiro número: ")
    val a = readLine()!!.replace(',', '.').toDouble()

    print("Entre com o segundo número: ")
    val b = readLine()!!.replace(',', '.').toDouble()

    print("Entre com o terceiro número: ")
    val c = readLine()!!.replace(',', '.').toDouble()

    print("Entre com o quarto número: ")
    val d = readLine()!!.replace(',', '.').toDouble()

    val mediaPonderada = (a * 1 + b * 2 + c * 3 + d * 4) / 10.0
    println("Média ponderada: $mediaPonderada")
}
