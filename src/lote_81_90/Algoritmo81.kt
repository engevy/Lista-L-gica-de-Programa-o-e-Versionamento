package lote_81_90

fun main() {
    print("Digite uma conta de três dígitos: ")
    val conta = readLine()!!.trim().toInt()
    require(conta in 100..999) { "Informe um número de três dígitos." }
    val d1 = conta / 100
    val d2 = (conta / 10) % 10
    val d3 = conta % 10
    val inverso = d3 * 100 + d2 * 10 + d1
    val soma = conta + inverso
    val somaPonderada = (soma / 100) * 1 + ((soma / 10) % 10) * 2 + (soma % 10) * 3
    println("Dígito verificador: ${somaPonderada % 10}")
}
