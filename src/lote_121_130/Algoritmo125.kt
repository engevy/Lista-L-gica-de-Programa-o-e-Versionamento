package lote_121_130

fun main() {
    print("Digite sua idade: ")
    val idade = readln().toInt()
    when {
        idade >= 65 -> println("Maior de 65")
        idade >= 18 -> println("Maior de idade")
        else -> println("Menor de idade")
    }
}
