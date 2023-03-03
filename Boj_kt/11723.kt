fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val num = br.readLine().toInt()
    var set = BooleanArray(21) { false }

    repeat(num) {
        val input = br.readLine().split(" ")
        when (input[0]) {
            "add" -> set[input[1].toInt()] = true
            "remove" -> set[input[1].toInt()] = false
            "check" -> if (set[input[1].toInt()]) bw.write("1\n") else bw.write("0\n")
            "toggle" -> set[input[1].toInt()] = !set[input[1].toInt()]
            "all" -> set = BooleanArray(21) { true }
            "empty" -> set = BooleanArray(21) { false }
        }
    }
    br.close()
    bw.flush()
    bw.close()
}
