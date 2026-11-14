package lote_101_110

fun main() {
    print("Ano atual: ")
    val anoAtual = readln().toInt()
    print("Ano de nascimento: ")
    val anoNascimento = readln().toInt()
    if (anoNascimento > anoAtual || anoNascimento <= 0) println("Ano de nascimento inválido")
    else println("Idade: ${anoAtual - anoNascimento}")
}
