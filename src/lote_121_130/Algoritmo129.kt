package lote_121_130

fun main() {
    print("Digite o salário: R$ ")
    val salario = readln().toDouble()
    val desconto = when {
        salario <= 600.0 -> 0.0
        salario <= 1200.0 -> salario * 0.20
        salario <= 2000.0 -> salario * 0.25
        else -> salario * 0.30
    }
    println("Desconto: R$ %.2f".format(desconto))
}
