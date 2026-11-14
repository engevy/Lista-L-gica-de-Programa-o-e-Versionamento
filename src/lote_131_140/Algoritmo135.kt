package lote_131_140

fun main() {
    print("Idade: ")
    val idade = readln().toInt()
    val classe = when {
        idade < 16 -> "Não eleitor"
        idade < 18 || idade > 65 -> "Eleitor facultativo"
        else -> "Eleitor obrigatório"
    }
    println(classe)
}
