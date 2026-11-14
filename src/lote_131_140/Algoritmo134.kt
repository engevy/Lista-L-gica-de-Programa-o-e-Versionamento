package lote_131_140

fun main() {
    print("Idade do nadador: ")
    val idade = readln().toInt()
    val categoria = when {
        idade < 5 -> "Não existe categoria para essa idade"
        idade <= 7 -> "Infantil A"
        idade <= 10 -> "Infantil B"
        idade <= 13 -> "Juvenil A"
        idade <= 17 -> "Juvenil B"
        else -> "Sênior"
    }
    println(categoria)
}
