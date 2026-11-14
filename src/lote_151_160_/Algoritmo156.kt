package lote_151_160_

fun main() {
    print("Dia: ")
    val dia = readln().toInt()
    print("Mês: ")
    val mes = readln().toInt()
    print("Ano: ")
    val ano = readln().toInt()
    val bissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)
    val diasNoMes = when (mes) {
        4, 6, 9, 11 -> 30
        2 -> if (bissexto) 29 else 28
        in 1..12 -> 31
        else -> 0
    }
    println(if (ano >= 1 && dia in 1..diasNoMes) "DATA VÁLIDA" else "DATA INVÁLIDA")
}
