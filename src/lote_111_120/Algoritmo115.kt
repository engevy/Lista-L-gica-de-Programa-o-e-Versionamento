package lote_111_120

fun main() {
    val x = readln().toDouble()
    val y = readln().toDouble()
    if (x == y) {
        println("Números iguais")
    } else {
        val maior = if (x > y) x else y
        val menor = if (x < y) x else y
        if (maior >= 0) println("Raiz quadrada do maior: ${kotlin.math.sqrt(maior)}")
        else println("Não existe raiz quadrada real do maior número")
        println("Quadrado do menor: ${menor * menor}")
    }
}
