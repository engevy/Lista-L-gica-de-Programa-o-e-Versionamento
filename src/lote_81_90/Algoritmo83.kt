package lote_81_90

fun main() {
    print(" Digite um número: ")
    val numero = readLine()!!.trim().toDouble()
    if (numero > 0.0) println("Inverso: ${1.0 / numero}")
    else println("Valor absoluto: ${kotlin.math.abs(numero)}")
}
