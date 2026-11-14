package lote_51_60

fun main() {
    print("Digite a diagonal maior do losango: ")
    val diagonalMaior = readLine()!!.toDouble()
    print("Digite a diagonal menor do losango: ")
    val diagonalMenor = readLine()!!.toDouble()
    val area = (diagonalMaior * diagonalMenor) / 2
    println("Área = $area")
}
