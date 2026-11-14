package lote_121_130

fun main() {
    print("Digite o valor de X: ")
    val x = readln().toDouble()
    when {
        x == 5.0 -> println("O número é 5")
        x == 200.0 -> println("O número é 200")
        x == 400.0 -> println("O número é 400")
        x in 500.0..1000.0 -> println("Intervalo 500–1000")
        else -> println("Fora do escopo")
    }
}
