package lote_101_110

fun main() {
    print("Nome: ")
    val nome = readln()
    print("Sexo (F/M): ")
    val sexo = readln()
    print("Idade: ")
    val idade = readln().toInt()
    if ((sexo == "F" || sexo == "f") && idade < 25) println("$nome ACEITA")
    else println("$nome NÃO ACEITA")
}
