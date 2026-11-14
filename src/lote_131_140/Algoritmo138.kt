package lote_131_140

fun main() {
    print("Número do mês (1 a 12): ")
    val numero = readln().toInt()
    val mes = when (numero) {
        1 -> "janeiro"
        2 -> "fevereiro"
        3 -> "março"
        4 -> "abril"
        5 -> "maio"
        6 -> "junho"
        7 -> "julho"
        8 -> "agosto"
        9 -> "setembro"
        10 -> "outubro"
        11 -> "novembro"
        12 -> "dezembro"
        else -> "Não existe mês correspondente"
    }
    println(mes)
}
