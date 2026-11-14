package lote_141_150

fun main() {
    print("Tipo de carro (A/B/C): ")
    val tipo = readln().trim().uppercase()
    print("Percurso em km: ")
    val km = readln().toDouble()
    val rendimento = when (tipo) { "A" -> 8.0; "B" -> 10.0; "C" -> 12.0; else -> null }
    if (rendimento == null) println("Modelo inexistente")
    else if (km < 0) println("Percurso inválido")
    else println("Consumo estimado: ${"%.2f".format(km / rendimento)} litros")
}
