fun main() {
    val n = readln().toInt()
    val times = mutableListOf<Pair<Int, Int>>()
    var end = 0
    var cnt = 0

    repeat(n) {
        val input = readln().split(" ").map { it.toInt() }
        times.add(input[0] to input[1])
    }
    times.sortWith(compareBy { it.first })
    times.sortWith(compareBy { it.second })
    for (i in times) {
        if (i.first >= end) {
            cnt++
            end = i.second
        }
    }
    print(cnt)
}