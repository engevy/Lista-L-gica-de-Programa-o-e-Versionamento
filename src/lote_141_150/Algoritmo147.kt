package lote_141_150

fun main() {
    println("Prato: 1 Vegetariano, 2 Peixe, 3 Frango, 4 Carne")
    val prato = when (readln().toInt()) { 1 -> 180; 2 -> 230; 3 -> 250; 4 -> 350; else -> null }
    println("Sobremesa: 1 Abacaxi, 2 Sorvete diet, 3 Mousse diet, 4 Mousse chocolate")
    val sobremesa = when (readln().toInt()) { 1 -> 75; 2 -> 110; 3 -> 170; 4 -> 200; else -> null }
    println("Bebida: 1 Chá, 2 Suco de laranja, 3 Suco de melão, 4 Refrigerante diet")
    val bebida = when (readln().toInt()) { 1 -> 20; 2 -> 70; 3 -> 100; 4 -> 65; else -> null }
    if (prato == null || sobremesa == null || bebida == null) println("Opção inválida")
    else println("Total da refeição: ${prato + sobremesa + bebida} calorias (tabela do livro)")
}
