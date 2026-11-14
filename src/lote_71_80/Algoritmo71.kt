package lote_71_80

fun main() {
    print("Digite a hora atual (0 a 23): ")
    val hora = readLine()!!.toInt()
    print("Digite os minutos (0 a 59): ")
    val minuto = readLine()!!.toInt()
    val totalMinutos = hora * 60 + minuto
    println("Até agora se passaram: $totalMinutos minutos")
}
