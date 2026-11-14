package lote_71_80

fun main() {
    print("Digite um número entre 0 e 60: ")
    val numero = readLine()!!.toInt()
    val sucessor = (numero + 1) % 61
    println("Sucessor: $sucessor")
}
