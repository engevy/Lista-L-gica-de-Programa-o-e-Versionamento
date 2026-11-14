package lote_61_70

fun main() {
    print("Tempo gasto na viagem (horas): ")
    val tempo = readLine()!!.toDouble()
    print("Velocidade média (km/h): ")
    val velocidade = readLine()!!.toDouble()
    val distancia = tempo * velocidade
    val litros = distancia / 12.0
    println("Velocidade média: $velocidade km/h")
    println("Tempo gasto: $tempo horas")
    println("Distância percorrida: $distancia km")
    println("Litros utilizados: $litros")
}
