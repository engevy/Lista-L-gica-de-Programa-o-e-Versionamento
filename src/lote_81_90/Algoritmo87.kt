package lote_81_90

import java.text.Normalizer

fun main() {
    print("Qual é a capital do Brasil? ")
    val resposta = readLine()!!.trim()
    val normalizada = Normalizer.normalize(resposta, Normalizer.Form.NFD)
        .replace(Regex("\\p{M}+"), "")
        .lowercase()
    when (normalizada) {
        "brasilia" -> println("PARABÉNS!")
        "braz ilia", "brazilia" -> println("CERTO! Mas atenção para a grafia: Brasília.")
        else -> println("ERRADO! ESTUDE MAIS!")
    }
}
