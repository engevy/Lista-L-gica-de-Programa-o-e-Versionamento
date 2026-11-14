package lote_71_80

fun main() {
    print("Digite a quantidade de fitas: ")
    val quantidade = readLine()!!.toInt()
    print("Digite o valor de cada aluguel: ")
    val valorAluguel = readLine()!!.toDouble()

    val alugueisPorMes = quantidade / 3
    val faturamentoAnual = alugueisPorMes * valorAluguel * 12.0
    val multasMensais = valorAluguel * 0.10 * alugueisPorMes / 10.0
    val quantidadeFinal = quantidade - quantidade * 0.02 + quantidade / 10.0

    println("Faturamento anual: $faturamentoAnual")
    println("Valor ganho com multas por mês: $multasMensais")
    println("Quantidade de fitas no final do ano: $quantidadeFinal")
}
