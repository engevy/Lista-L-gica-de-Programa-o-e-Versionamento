package lote_151_160_

fun main() {
    print("Data no formato ddmmaaaa: ")
    val data = readln().trim()
    if (data.length != 8 || !data.all { it.isDigit() }) {
        println("DATA INVÁLIDA")
        return
    }
    val dia = data.substring(0, 2).toInt()
    val mes = data.substring(2, 4).toInt()
    val ano = data.substring(4, 8).toInt()
    val bissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)
    val diasNoMes = when (mes) {
        4, 6, 9, 11 -> 30
        2 -> if (bissexto) 29 else 28
        in 1..12 -> 31
        else -> 0
    }
    println(if (ano >= 1 && dia in 1..diasNoMes) "DATA VÁLIDA" else "DATA INVÁLIDA")
}
