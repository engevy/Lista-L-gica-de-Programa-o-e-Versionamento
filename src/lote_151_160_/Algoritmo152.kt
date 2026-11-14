package lote_151_160_

fun main() {

    print("Peso (kg): ")
    val peso = readln().toDouble()
    print("Idade (anos): ")
    val idade = readln().toInt()
    if (peso <= 0 || idade < 0) { println("Dados inválidos"); return }
    if (peso < 5) { println("Fora da tabela do exercício. Consulte um profissional de saúde."); return }
    val miligramas = when {
        idade >= 12 && peso >= 60 -> 1000
        idade >= 12 -> 875
        peso <= 9 -> 125
        peso <= 16 -> 250
        peso <= 24 -> 375
        peso <= 30 -> 500
        else -> 750
    }
    val miligramasPorGota = 500.0 / 20.0
    val gotas = miligramas / miligramasPorGota
    println("Resultado matemático da tabela histórica: $gotas gotas")
    println("ATENÇÃO: exercício de programação, não é receita nem orientação de dose.")
}
