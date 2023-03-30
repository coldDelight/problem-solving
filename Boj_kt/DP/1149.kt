fun main() {

    val br = System.`in`.bufferedReader()
    val n = readln().toInt()

    val r = IntArray(n + 1) { 0 }
    val g = IntArray(n + 1) { 0 }
    val b = IntArray(n + 1) { 0 }

    repeat(n) {
        val rgb = br.readLine().split(" ").map { it.toInt() }
        r[it] = rgb[0]
        g[it] = rgb[1]
        b[it] = rgb[2]
        if (it != 0) {
            r[it] += minOf(g[it - 1], b[it - 1])
            g[it] += minOf(r[it - 1], b[it - 1])
            b[it] += minOf(g[it - 1], r[it - 1])
        }
    }
    br.close()

    println(minOf(r[n - 1], g[n - 1], b[n - 1]))
}