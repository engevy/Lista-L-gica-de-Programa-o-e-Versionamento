package lote_71_80

fun main() {
    print("Digite o peso em kg (somente a parte inteira): ")
    val peso = readLine()!!.toInt()
    val pesoGramas = peso * 1000
    val novoPesoGramas = (pesoGramas * 1.12).toInt()
    println("Peso em gramas: $pesoGramas")
    println("Novo peso em gramas (aumento de 12%): $novoPesoGramas")
}
