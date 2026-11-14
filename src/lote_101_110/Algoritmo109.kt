package lote_101_110

fun main() {
    print("Primeiro nome: ")
    val nome1 = readln()
    print("Segundo nome: ")
    val nome2 = readln()
    if (nome1 < nome2) {
        println(nome1)
        println(nome2)
    } else {
        println(nome2)
        println(nome1)
    }
}
