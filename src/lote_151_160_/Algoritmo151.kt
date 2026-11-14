package lote_151_160_

fun main() {
    print("Nome do paciente: ")
    val nome = readln()
    print("Peso em kg: ")
    val peso = readln().toDouble()
    print("Altura em metros: ")
    val altura = readln().toDouble()
    if (peso <= 0 || altura <= 0) { println("Dados inválidos"); return }
    val imc = peso / (altura * altura)
    // Faixas históricas do livro; não representam avaliação clínica atual.
    val faixa = when {
        imc < 20 -> "abaixo do peso"
        imc <= 25 -> "normal"
        imc <= 30 -> "excesso de peso"
        imc <= 35 -> "obesidade"
        else -> "obesidade mórbida"
    }
    println("$nome: IMC = ${"%.2f".format(imc)}; faixa do exercício: $faixa")
}
