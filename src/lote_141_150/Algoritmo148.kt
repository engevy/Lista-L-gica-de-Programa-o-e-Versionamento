package lote_141_150

fun main() {
    println("Destino: 1 Norte, 2 Nordeste, 3 Centro-Oeste, 4 Sul")
    val destino = readln().toInt()
    println("Viagem: 1 Ida, 2 Ida e volta")
    val viagem = readln().toInt()
    val preco = when (destino) {
        1 -> if (viagem == 1) 500 else if (viagem == 2) 900 else null
        2 -> if (viagem == 1) 350 else if (viagem == 2) 650 else null
        3 -> if (viagem == 1) 350 else if (viagem == 2) 600 else null
        4 -> if (viagem == 1) 300 else if (viagem == 2) 550 else null
        else -> null
    }
    if (preco == null) println("Opção inexistente")
    else println("Valor da passagem: R$ ${"%.2f".format(preco.toDouble())}")
}
