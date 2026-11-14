package lote_151_160_

fun main() {
    print("Índice de poluição: ")
    val indice = readln().toDouble()
    val mensagem = when {
        indice >= 0.5 -> "Suspender atividades das indústrias dos grupos 1, 2 e 3"
        indice >= 0.4 -> "Suspender atividades das indústrias dos grupos 1 e 2"
        indice >= 0.3 -> "Suspender atividades das indústrias do grupo 1"
        else -> "Índice de poluição aceitável para todos os grupos"
    }
    println(mensagem)
}
