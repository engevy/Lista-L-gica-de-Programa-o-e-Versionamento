package lote_71_80

import kotlin.math.floor

fun main() {
    print("Digite um número real positivo: ")
    val numero = readLine()!!.toDouble()
    val parteInteira = floor(numero).toInt()
    val parteFracionaria = numero - parteInteira
    val arredondado = (numero + 0.00001).toInt()
    println("Parte inteira: $parteInteira")
    println("Parte fracionária: %.3f".format(parteFracionaria))
    println("Número arredondado: $arredondado")
}
