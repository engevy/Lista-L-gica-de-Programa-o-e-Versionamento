package lote_41_50

fun main() {
    print("Entre com o valor do salário mínimo: ")
    val salarioMinimo = readLine()!!.replace(',', '.').toDouble()

    print("Entre com a quantidade de quilowatts gasta: ")
    val quantidade = readLine()!!.replace(',', '.').toDouble()

    val precoQuilowatt = salarioMinimo / 700.0
    val valorPagar = precoQuilowatt * quantidade
    val valorComDesconto = valorPagar * 0.9

    println("Preço do quilowatt: R$ $precoQuilowatt")
    println("Valor a ser pago: R$ $valorPagar")
    println("Valor com desconto de 10%: R$ $valorComDesconto")
}
