package lote_61_70

fun main() {
    print("Valor da prestação: ")
    val valor = readLine()!!.toDouble()
    print("Taxa de juros (%): ")
    val taxa = readLine()!!.toDouble()
    print("Tempo de atraso (meses): ")
    val tempo = readLine()!!.toInt()
    val prestacao = valor + (valor * (taxa / 100.0) * tempo)
    println("Valor da prestação em atraso: $prestacao")
}
