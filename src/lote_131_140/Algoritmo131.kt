package lote_131_140

fun main() {
    print("Nome do aluno: ")
    val nome = readln().trim()
    val inicial = nome.firstOrNull()?.uppercaseChar()
    val sala = when (inicial) {
        in 'A'..'K' -> "101"
        in 'L'..'N' -> "102"
        in 'O'..'Z' -> "103"
        else -> null
    }
    println(if (sala == null) "NOME INVALIDO" else "$nome - Bloco F, sala $sala")
}
