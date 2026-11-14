package lote_111_120

fun main() {
    var a = readln().toDouble()
    var b = readln().toDouble()
    var c = readln().toDouble()
    if (a > b) { val aux = a; a = b; b = aux }
    if (a > c) { val aux = a; a = c; c = aux }
    if (b > c) { val aux = b; b = c; c = aux }
    println("Ordem crescente: $a $b $c")
}
