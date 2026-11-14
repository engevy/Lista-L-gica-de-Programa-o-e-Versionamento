package lote_61_70

fun main() {
    print("Entre com o primeiro termo: ")
    val termo = readLine()!!.toInt()
    print("Entre com a razão: ")
    val razao = readLine()!!.toInt()
    val quinto = termo * Math.pow(razao.toDouble(), 4.0).toInt()
    println("O 5º termo desta P.G. é: $quinto")
}
