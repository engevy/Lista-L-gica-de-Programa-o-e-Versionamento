package lote_121_130

fun main() {
    print("Digite o 1º lado: ")
    val a = readln().toDouble()
    print("Digite o 2º lado: ")
    val b = readln().toDouble()
    print("Digite o 3º lado: ")
    val c = readln().toDouble()
    if (a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b) {
        val lados = listOf(a, b, c).sorted()
        val somaQuadrados = lados[0] * lados[0] + lados[1] * lados[1]
        val maiorQuadrado = lados[2] * lados[2]
        val diferenca = maiorQuadrado - somaQuadrados
        val tolerancia = 1e-9 * maxOf(1.0, maiorQuadrado, somaQuadrados)
        when {
            kotlin.math.abs(diferenca) <= tolerancia -> println("Triângulo retângulo")
            diferenca > 0 -> println("Triângulo obtusângulo")
            else -> println("Triângulo acutângulo")
        }
    } else println("As medidas não formam um triângulo")
}
