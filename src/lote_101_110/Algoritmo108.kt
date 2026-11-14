package lote_101_110

fun main() {
    print("Nome: ")
    val nome = readln()
    val primeiroNome = nome.substringBefore(' ')
    if (primeiroNome == "JOSÉ" || primeiroNome == "José" || primeiroNome == "josé") println(nome)
}
