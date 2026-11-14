package lote_61_70

fun main() {
    print("Digite o numerador: ")
    val numerador = readLine()!!.toInt()
    print("Digite o denominador: ")
    val denominador = readLine()!!.toInt()
    require(denominador != 0) { "O denominador não pode ser zero." }
    val decimal = numerador.toDouble() / denominador
    println("Decimal: $decimal")
}
