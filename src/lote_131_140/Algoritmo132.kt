package lote_131_140

fun main() {
    print("Valor em reais: ")
    val reais = readln().toDouble()
    print("Moeda (f=franco suíço, l=libra, d=dólar, m=marco alemão): ")
    val moeda = readln().trim().lowercase()
    val nome = when (moeda) {
        "f" -> "francos suíços"
        "l" -> "libras esterlinas"
        "d" -> "dólares"
        "m" -> "marcos alemães"
        else -> null
    }
    if (nome == null) {
        println("Moeda desconhecida")
        return
    }
    print("Valor de uma unidade de $nome em reais: ")
    val cotacao = readln().toDouble()
    if (cotacao <= 0.0) println("Cotação inválida")
    else println("Total de $nome: ${reais / cotacao}")
}
