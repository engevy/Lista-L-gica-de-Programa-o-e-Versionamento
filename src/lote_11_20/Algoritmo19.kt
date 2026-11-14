package lote_11_20// Algoritmo 19 — Demonstrar funções matemáticas e conversões numéricas.
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.exp
import kotlin.math.ln
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt

// Os exemplos do livro indicam arredondamento para o inteiro mais próximo,
// com empate (.5) para o inteiro par. Math.rint reproduz esse comportamento.
// A função formatar trunca as casas decimais, como sugere o +0.001 do exemplo.
private fun realint(valor: Double): Int = Math.rint(valor).toInt()

private fun intreal(valor: Int): Double = valor.toDouble()

private fun formatar(valor: Double, casas: Int): String =
    BigDecimal.valueOf(valor).setScale(casas, RoundingMode.DOWN).toPlainString()

fun main() {
    println("raiz: ${sqrt(64.0)}")
    println("raiz com exp e log e realint: ${realint(exp(1.0 / 2.0 * ln(64.0)))}")
    println("raiz com exp e log sem realint: ${exp(1.0 / 2.0 * ln(64.0))}")
    println(formatar(sin(45.0 * PI / 180.0) + 0.0001, 3))
    println("potencia com exp e log e formatar: ${formatar(exp(3.0 * ln(8.0)) + 0.001, 3)}")
    println("potencia com exp e log sem formatar: ${exp(3.0 * ln(8.0))}")
    println("potencia com operador ** e formatar: ${formatar(8.0.pow(3.0), 3)}")
    println("raiz cubica: ${exp(1.0 / 3.0 * ln(8.0))}")
    println("absoluto: ${abs(-8)}")
    println("absoluto: ${abs(8)}")
    println("convertendo para inteiro 5.5: ${realint(5.5)}")
    println("convertendo para inteiro 6.5: ${realint(6.5)}")
    println("convertendo para inteiro 6.5 + 0.0001: ${realint(6.5 + 0.0001)}")
    println("convertendo para inteiro 5.45: ${realint(5.45)}")
    println("convertendo para inteiro 5.51: ${realint(5.51)}")
    println("convertendo para real 87: ${intreal(87)}")
    println("convertendo para int 3/4: ${realint(3.0 / 4.0)}")
}
