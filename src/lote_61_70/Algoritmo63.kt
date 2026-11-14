package lote_61_70

fun main() {
    print("Horas-aula dadas no mês: ")
    val numeroAulas = readLine()!!.toInt()
    print("Valor da hora-aula: ")
    val valorHora = readLine()!!.toDouble()
    print("Percentual de desconto do INSS: ")
    val percentual = readLine()!!.toDouble()
    val salarioBruto = numeroAulas * valorHora
    val desconto = percentual / 100.0 * salarioBruto
    val salarioLiquido = salarioBruto - desconto
    println("Salário líquido: $salarioLiquido")
}
