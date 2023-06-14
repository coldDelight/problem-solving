fun main() {
    val br = System.`in`.bufferedReader()
    val k = br.readLine().toInt()
    val order = Array(12) { 0 to 0 }

    repeat(6) {
        val (way, m) = br.readLine().split(" ").map { it.toInt() }
        order[it] = way to m
        order[it + 6] = way to m
    }
    br.close()
    for (i in 3 until 12) {
        if (order[i].first == order[i - 2].first && order[i - 1].first == order[i - 3].first) {
            val bigSize = order[i + 1].second * order[i + 2].second
            val smallSize = order[i - 2].second * order[i - 1].second
            print((bigSize - smallSize) * k)
            break
        }
    }
}