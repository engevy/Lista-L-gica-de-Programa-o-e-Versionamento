package lote_41_50


fun main() {
    print("Digite o saldo da aplicação: ")
    val saldo = readLine()!!.replace(',', '.').toDouble()

    val novoSaldo = saldo * 1.01
    println("Novo saldo: $novoSaldo")
}
