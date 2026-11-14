package lote_141_150

fun main() {
    val jogadores = (1..3).map {
        print("Nome do finalista $it: "); val nome = readln()
        print("Pontos: "); nome to readln().toInt()
    }.sortedByDescending { it.second }
    println("Vencedor: ${jogadores[0].first} - ${jogadores[0].second} pontos")
    println("Segundo colocado: ${jogadores[1].first} - ${jogadores[1].second} pontos")
    println("Terceiro colocado: ${jogadores[2].first} - ${jogadores[2].second} pontos")
}
