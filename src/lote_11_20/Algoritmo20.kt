package lote_11_20

// Algoritmo 20 — Demonstrar operações básicas com strings.
fun main() {
    print("\ndigite palavra 1: ")
    val c = readln()

    print("\ndigite palavra 2: ")
    val c1 = readln()

    // strtam(c)
    print("\ntamanho da 1 palavra: ${c.length}")

    // strconcat(c, c1)
    print("\nconcatenando: ${c + c1}")

    // strcopia(c): strings Kotlin são imutáveis; atribuir preserva o conteúdo.
    val d = c
    print("\nE O CONTEUDO DE D: $d")

    // Armazena a concatenação em outra variável.
    val d1 = c + c1
    print("\nconcatenacao: $d1")

    // As funções seguintes recebem c, como está escrito no algoritmo do livro.
    print("\nprimeiro caractere: ${c.firstOrNull() ?: ""}")
    print("\nultimo caractere: ${c.lastOrNull() ?: ""}")
    print("\ntodos menos o primeiro: ${c.drop(1)}")

    // O livro observa que strelem(c, 3) retorna o 4º caractere (índice inicial 0).
    print("\no terceiro elemento: ${c.getOrNull(3) ?: "(inexistente)"}")
    print("\nos tres primeiros elementos: ${c.take(3)}")
    print("\nos tres ultimos elementos: ${c.takeLast(3)}")
    print("\n")
}
