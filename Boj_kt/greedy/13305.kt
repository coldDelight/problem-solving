fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    var tmp = br.readLine().split(" ").map { it.toLong() }
    val road = LongArray(n - 1) { 0 }
    val oil = LongArray(n) { 0 }
    repeat(n - 1) {
        road[it] = tmp[it]
    }
    tmp = br.readLine().split(" ").map { it.toLong() }
    br.close()
    repeat(n - 1) {
        oil[it] = tmp[it]
    }

    var minOil = oil[0]
    var sum = 0L
    road.forEachIndexed { index, value ->
        if (minOil > oil[index]) {
            minOil = oil[index]
        }
        sum += minOil * value
    }
    bw.write("$sum")
    bw.flush()
    bw.close()
}