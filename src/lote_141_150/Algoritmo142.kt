package lote_141_150

fun main() {
    val pontos = (1..3).map {
        print("Pontos do jogador $it: ")
        readln().toInt()
    }.sortedDescending()
    println("Pontos em ordem decrescente: ${pontos.joinToString(" ")}")
    val soma = pontos.sum()
    if (soma > 100) println("Média: ${"%.2f".format(soma / 3.0)}")
    else println("Equipe desclassificada!")
}
