package lote_121_130

fun main() {
    val numeros = (1..5).map { i ->
        print("Digite o ${i}º número inteiro: ")
        readln().toInt()
    }
    if (numeros.toSet().size != 5) {
        println("Os valores devem ser diferentes")
    } else {
        var maior = numeros[0]
        var menor = numeros[0]
        for (numero in numeros.drop(1)) {
            if (numero > maior) maior = numero
            if (numero < menor) menor = numero
        }
        println("Maior = $maior")
        println("Menor = $menor")
    }
}
