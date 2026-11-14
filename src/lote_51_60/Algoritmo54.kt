package lote_51_60

fun main() {
    print("Digite a base do triângulo: ")
    val base = readLine()!!.toDouble()
    print("Digite a altura do triângulo: ")
    val altura = readLine()!!.toDouble()
    val area = (base * altura) / 2
    println("Área = $area")
}
