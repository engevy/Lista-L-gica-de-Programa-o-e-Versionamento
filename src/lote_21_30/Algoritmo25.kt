package lote_21_30

fun main() {
    print("Digite uma data no formato DDMMAA: ")
    val data = readLine()!!.trim().toInt()

    val dia = data / 10_000
    val mes = (data % 10_000) / 100
    val ano = data % 100

    println("DIA: $dia")
    println("MES: $mes")
    println("ANO: $ano")
}
