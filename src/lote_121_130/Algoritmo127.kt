package lote_121_130

fun main() {
    print("Digite o nome do aluno: ")
    val nome = readln()
    print("Digite a nota da PR1: ")
    val nota1 = readln().toDouble()
    print("Digite a nota da PR2: ")
    val nota2 = readln().toDouble()
    val media = (nota1 + nota2) / 2.0
    val situacao = when {
        media >= 7.0 -> "Aprovado"
        media < 3.0 -> "Reprovado"
        else -> "Prova Final"
    }
    println("Nome: $nome")
    println("PR1: $nota1 | PR2: $nota2 | Média: $media")
    println("Situação: $situacao")
}
