package lote_31_40

fun main() {
    print("Entre com o dividendo: ")
    val dividendo = readLine()!!.toInt()

    print("Entre com o divisor: ")
    val divisor = readLine()!!.toInt()

    require(divisor != 0) { "O divisor não pode ser zero." }

    val quociente = dividendo / divisor
    val resto = dividendo % divisor

    println("Dividendo: $dividendo")
    println("Divisor: $divisor")
    println("Quociente: $quociente")
    println("Resto: $resto")
}
