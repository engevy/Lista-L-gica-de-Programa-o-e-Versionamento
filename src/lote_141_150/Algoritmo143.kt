package lote_141_150

fun main() {
    print("Palavra: ")
    val palavra = readln()
    if (palavra.isEmpty()) { println("Palavra vazia"); return }
    if (palavra.length % 2 == 0) {
        val meio = palavra.substring(palavra.length / 2 - 1, palavra.length / 2 + 1)
        println(if (meio == "rr" || meio == "ss") "É rr ou ss" else "Não é rr ou ss")
    } else {
        val central = palavra[palavra.length / 2]
        println(if (central in "aeiou") "É vogal" else "Não é vogal")
    }
}
