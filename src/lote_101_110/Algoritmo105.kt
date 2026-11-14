package lote_101_110

fun main() {
    print("Sigla do estado: ")
    val sigla = readln()
    when (sigla) {
        "RJ", "rj" -> println("Carioca")
        "SP", "sp" -> println("Paulista")
        "MG", "mg" -> println("Mineiro")
        else -> println("Outros estados")
    }
}
