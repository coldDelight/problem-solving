fun main() {

    val (a, b) = readln().split(" ").map { it.toInt() }

    var idx = 0
    var seq = 1
    var sum = 0

    while (true) {
        repeat(seq) {
            idx++
            if (idx in a..b) {
                sum += seq
            }
        }
        if (idx >= b) break
        seq++
    }

    println(sum)
}