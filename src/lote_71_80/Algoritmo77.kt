package lote_71_80

fun main() {
    print("Digite o primeiro número real: ")
    val a = readLine()!!.toDouble()
    print("Digite o segundo número real: ")
    val b = readLine()!!.toDouble()
    val quadradoDaDiferenca = (a - b) * (a - b)
    val diferencaDosQuadrados = a * a - b * b
    println("Quadrado da diferença: $quadradoDaDiferenca")
    println("Diferença dos quadrados: $diferencaDosQuadrados")
}
