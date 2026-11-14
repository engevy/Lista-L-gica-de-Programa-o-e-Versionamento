package lote_71_80

fun main() {
    print("Digite o valor do depósito: ")
    val deposito = readLine()!!.toDouble()
    print("Digite a taxa de juros (em %): ")
    val taxa = readLine()!!.toDouble()
    val rendimento = deposito * taxa / 100.0
    val total = deposito + rendimento
    println("Rendimento: $rendimento")
    println("Total após o rendimento: $total")
}
