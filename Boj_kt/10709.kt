fun main() {
    val (h, w) = readln().split(" ").map { it.toInt() }
    repeat(h) {
        val line = readln()
        var state = -1
        for (i in line) {
            when (i) {
                'c' -> {
                    state = 0

                }
                '.' -> {
                    if (state != -1) state++
                }
            }
            print("$state ")
        }
        println()
    }
}