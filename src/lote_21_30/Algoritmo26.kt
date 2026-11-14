package lote_21_30

fun main() {
    print("Digite uma data no formato DDMMAA: ")
    val data = readLine()!!.trim().toInt()

    val dia = data / 10_000
    val mes = (data % 10_000) / 100
    val ano = data % 100
    val novaData = mes * 10_000 + dia * 100 + ano

    println("DIA: $dia")
    println("MES: $mes")
    println("ANO: $ano")
    println("DATA NO FORMATO MMDDAA: $novaData")
}
