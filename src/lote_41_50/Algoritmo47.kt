package lote_41_50

fun main() {
    print("Entre com um número de três algarismos: ")
    val numero = readLine()!!.toInt()
    require(numero in 100..999) { "Informe um número inteiro de três algarismos." }

    val centena = numero / 100
    val dezena = (numero % 100) / 10
    val unidade = numero % 10

    val invertido = unidade * 100 + dezena * 10 + centena

    println("Número: $numero")
    println("Invertido: $invertido")
}
