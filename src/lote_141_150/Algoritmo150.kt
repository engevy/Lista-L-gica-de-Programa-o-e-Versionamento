package lote_141_150

import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

fun main() {
    print("Ângulo em graus: ")
    val graus = readln().toDouble()
    val normalizado = ((graus % 360.0) + 360.0) % 360.0
    val radianos = Math.toRadians(normalizado)
    val quadrantePar = (normalizado > 90.0 && normalizado <= 180.0) ||
                       (normalizado > 270.0 && normalizado <= 360.0)
    if (quadrantePar) println("Seno: ${sin(radianos)}")
    else println("Cosseno: ${cos(radianos)}")
}
