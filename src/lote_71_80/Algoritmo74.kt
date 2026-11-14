package lote_71_80

fun main() {
    print("Digite o valor do salário mínimo: ")
    val salarioMinimo = readLine()!!.toDouble()
    print("Digite o salário da pessoa: ")
    val salarioPessoa = readLine()!!.toDouble()
    val quantidade = salarioPessoa / salarioMinimo
    println("A pessoa ganha $quantidade salários mínimos")
}
