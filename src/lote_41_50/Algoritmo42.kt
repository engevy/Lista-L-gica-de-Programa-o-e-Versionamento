package lote_41_50
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.tan

fun main() {
    print("Digite um ângulo em graus: ")
    val angulo = readLine()!!.replace(',', '.').toDouble()

    val anguloRadiano = angulo * PI / 180.0
    val seno = sin(anguloRadiano)
    val cosseno = cos(anguloRadiano)
    val tangente = tan(anguloRadiano)
    val cossecante = 1.0 / seno
    val secante = 1.0 / cosseno
    val cotangente = 1.0 / tangente

    println("Seno: $seno")
    println("Co-seno: $cosseno")
    println("Tangente: $tangente")
    println("Co-secante: $cossecante")
    println("Secante: $secante")
    println("Co-tangente: $cotangente")
}
