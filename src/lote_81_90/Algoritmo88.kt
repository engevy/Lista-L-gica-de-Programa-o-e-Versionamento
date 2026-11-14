package lote_81_90

fun main() {
    print("***** CALCULADORA *****\n+ para somar\n- para subtrair\n* para multiplicar\n/ para dividir\nDigite a opção: ")
    val opcao = readLine()!!.trim()
    if (opcao !in listOf("+", "-", "*", "/")) {
        println("OPÇÃO NÃO DISPONÍVEL!")
        return
    }
    print("Digite o primeiro número: ")
    val a = readLine()!!.trim().toDouble()
    print("Digite o segundo número: ")
    val b = readLine()!!.trim().toDouble()
    when (opcao) {
        "+" -> println("SOMA: ${a + b}")
        "-" -> println("SUBTRAÇÃO: ${a - b}")
        "*" -> println("MULTIPLICAÇÃO: ${a * b}")
        "/" -> if (b != 0.0) println("DIVISÃO: ${a / b}") else println("Não é possível dividir por zero.")
    }
}
