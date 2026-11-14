package lote_121_130

fun main() {
    print("Digite um verbo no infinitivo: ")
    val verbo = readln().trim().lowercase()
    if (!verbo.endsWith("r") || verbo.length < 2) {
        println("Não é um verbo no infinitivo")
    } else {
        when (verbo[verbo.length - 2]) {
            'a' -> println("1ª conjugação")
            'e', 'o' -> println("2ª conjugação")
            'i' -> println("3ª conjugação")
            else -> println("Não existe verbo com essa terminação")
        }
    }
}
