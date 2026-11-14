package lote_131_140

fun main() {

    print("Altura em metros: ")
    val altura = readln().toDouble()
    print("Categoria da fórmula do livro (M/F): ")
    val sexo = readln().trim().uppercase()
    val resultado = when (sexo) {
        "M" -> 72.7 * altura - 58.0
        "F" -> 62.1 * altura - 44.7
        else -> null
    }
    println(if (resultado == null) "Opção inválida" else "Resultado da fórmula do livro: $resultado")
}
