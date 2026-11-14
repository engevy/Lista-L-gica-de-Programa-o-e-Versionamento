package lote_41_50

fun main() {
    print("Entre com um nome: ")
    val nome = readLine()!!

    val primeiroCaractere = nome.firstOrNull()?.toString() ?: ""
    val ultimoCaractere = nome.lastOrNull()?.toString() ?: ""
    val primeiroAoTerceiro = nome.take(3)
    val quartoCaractere = nome.getOrNull(3)?.toString() ?: ""
    val todosMenosPrimeiro = nome.drop(1)
    val doisUltimos = nome.takeLast(2)

    println("Todo nome: $nome")
    println("Primeiro caractere: $primeiroCaractere")
    println("Último caractere: $ultimoCaractere")
    println("Do primeiro ao terceiro caractere: $primeiroAoTerceiro")
    println("Quarto caractere: $quartoCaractere")
    println("Todos menos o primeiro: $todosMenosPrimeiro")
    println("Os dois últimos: $doisUltimos")
}
