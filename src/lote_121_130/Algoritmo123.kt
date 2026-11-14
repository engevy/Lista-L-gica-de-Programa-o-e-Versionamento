package lote_121_130

fun main() {
    print("Digite o 1º lado: ")
    val a = readln().toDouble()
    print("Digite o 2º lado: ")
    val b = readln().toDouble()
    print("Digite o 3º lado: ")
    val c = readln().toDouble()
    if (a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b) {
        when {
            a == b && b == c -> println("Triângulo equilátero")
            a == b || a == c || b == c -> println("Triângulo isósceles")
            else -> println("Triângulo escaleno")
        }
    } else println("As medidas não formam um triângulo")
}
