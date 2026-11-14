package lote_31_40

fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.replace(',', '.').toDouble()

    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.replace(',', '.').toDouble()

    val media = (nota1 + nota2) / 2.0
    println("Média: $media")
}
