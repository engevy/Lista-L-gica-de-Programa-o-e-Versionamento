package lote_81_90

fun main() {
    val planetas = mapOf(
        1 to ("Mercúrio" to 0.37),
        2 to ("Vênus" to 0.88),
        3 to ("Marte" to 0.38),
        4 to ("Júpiter" to 2.64),
        5 to ("Saturno" to 1.15),
        6 to ("Urano" to 1.17)
    )
    println("Planetas disponíveis:\n1 - Mercúrio\n2 - Vênus\n3 - Marte\n4 - Júpiter\n5 - Saturno\n6 - Urano")
    print("Escolha o planeta: ")
    val opcao = readLine()!!.trim().toInt()
    val planeta = planetas[opcao]
    if (planeta == null) {
        println("Este planeta não pode ser analisado.")
        return
    }
    print("Digite seu peso na Terra: ")
    val pesoTerra = readLine()!!.trim().toDouble()
    val pesoPlaneta = (pesoTerra / 10.0) * planeta.second
    println("Seu peso em ${planeta.first}: $pesoPlaneta")
}
