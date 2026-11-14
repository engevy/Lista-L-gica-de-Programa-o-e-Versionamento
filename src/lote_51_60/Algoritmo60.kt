package lote_51_60

fun main() {
    print("Entre com o 1º termo da P.A.: ")
    val primeiroTermo = readLine()!!.toInt()
    print("Entre com a razão: ")
    val razao = readLine()!!.toInt()
    val decimoTermo = primeiroTermo + 9 * razao
    println("O 10º termo desta P.A. é: $decimoTermo")
}
