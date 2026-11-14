package lote_131_140

fun main() {
    print("Município: ")
    val nome = readln()
    print("Número de eleitores aptos: ")
    val eleitores = readln().toInt()
    print("Votos do candidato mais votado: ")
    val votos = readln().toInt()
    if (eleitores < 0 || votos < 0 || votos > eleitores) {
        println("Dados inválidos")
        return
    }

    val segundoTurno = eleitores > 20000 && votos * 2L <= eleitores.toLong()
    println("$nome ${if (segundoTurno) "terá" else "não terá"} segundo turno")
}
