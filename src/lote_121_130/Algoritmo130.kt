package lote_121_130

fun main() {
    print("Digite o valor de compra do produto: R$ ")
    val valor = readln().toDouble()
    val venda = if (valor < 20.0) valor * 1.45 else valor * 1.30
    println("Valor de venda: R$ %.2f".format(venda))
}
