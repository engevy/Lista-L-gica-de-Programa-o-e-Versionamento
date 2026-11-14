package lote_81_90

fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.trim().toDouble()
    if (numero > 0.0) println("POSITIVO")
    else if (numero < 0.0) println("NEGATIVO")
    else println("NULO")
}
