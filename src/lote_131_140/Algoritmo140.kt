package lote_131_140

fun main() {
    print("Primeiro nome: ")
    val nome = readln().trim()
    print("Valor da conta: ")
    val conta = readln().toDouble()
    val inicial = nome.firstOrNull()?.uppercaseChar()
    if (inicial in listOf('A', 'D', 'M', 'S')) {
        println("$nome - valor com desconto: R$ ${"%.2f".format(conta * 0.70)}")
    } else {
        println("Que pena. Nesta semana o desconto não é para seu nome; mas continue nos prestigiando que sua vez chegará.")
    }
}
