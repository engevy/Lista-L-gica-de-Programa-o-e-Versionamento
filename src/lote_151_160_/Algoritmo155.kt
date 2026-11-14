package lote_151_160_

fun main() {
    print("Palavra: ")
    val palavra = readln()
    if (palavra.isEmpty()) { println("Palavra vazia"); return }
    val resultado = if (palavra.first().lowercaseChar() in listOf('l', 'd')) {
        palavra.take(2) + palavra.last()
    } else {
        palavra.drop(1)
    }
    println("Nova palavra: $resultado")
}
