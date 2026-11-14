package lote_141_150

fun main() {
    print("Nome do livro: ")
    val livro = readln()
    print("Tipo de usuário (professor/aluno): ")
    val tipo = readln().trim().lowercase()
    val dias = when (tipo) { "professor" -> 10; "aluno" -> 3; else -> 0 }
    if (dias == 0) println("Tipo de usuário desconhecido")
    else {
        println("Nome do livro: $livro")
        println("Tipo de usuário: $tipo")
        println("Total de dias: $dias")
    }
}
