package lote_91_100

fun main() {
    print("Digite o salario bruto: ")
    val salario = readLine()!!.toDouble()
    print("Digite o valor da prestacao: ")
    val prestacao = readLine()!!.toDouble()
    if (prestacao <= 0.30 * salario) println("Emprestimo concedido")
    else println("Emprestimo negado")
}
