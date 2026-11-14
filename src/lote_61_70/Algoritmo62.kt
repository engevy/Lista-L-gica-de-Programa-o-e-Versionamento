package lote_61_70

fun main() {
    print("Digite o valor do produto: ")
    val preco = readLine()!!.toDouble()
    val novoPreco = preco * 0.91
    println("Preço com desconto: $novoPreco")
}
