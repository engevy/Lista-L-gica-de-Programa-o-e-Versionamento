package lote_131_140

fun main() {
    print("Nome: ")
    val nome = readln()
    print("Idade: ")
    val idade = readln().toInt()
    if (idade < 0) {
        println("Idade inválida")
        return
    }
    val valor = when {
        idade <= 10 -> 30
        idade <= 29 -> 60
        idade <= 45 -> 120
        idade <= 59 -> 150
        idade <= 65 -> 250
        else -> 400
    }
    println("$nome pagará R$ ${"%.2f".format(valor.toDouble())}")
}
