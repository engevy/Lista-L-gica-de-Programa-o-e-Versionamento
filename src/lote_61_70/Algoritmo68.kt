package lote_61_70

fun main() {
    print("Digite o primeiro número: ")
    var a = readLine()!!.toDouble()
    print("Digite o segundo número: ")
    var b = readLine()!!.toDouble()
    val auxiliar = a
    a = b
    b = auxiliar
    println("A = $a")
    println("B = $b")
}
