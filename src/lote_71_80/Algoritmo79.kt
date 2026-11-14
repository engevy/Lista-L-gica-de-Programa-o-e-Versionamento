package lote_71_80

import kotlin.math.pow

fun main() {
    print("Digite o valor da aplicação mensal: ")
    val p = readLine()!!.toDouble()
    print("Digite a taxa de juros (em %, como no enunciado): ")
    val taxaPercentual = readLine()!!.toDouble()
    print("Digite o número de meses: ")
    val n = readLine()!!.toInt()
    val i = taxaPercentual / 100.0
    val acumulado = if (i == 0.0) p * n else p * ((1.0 + i).pow(n) - 1.0) / i
    println("Valor acumulado: $acumulado")
}
