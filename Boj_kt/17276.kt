fun main() {
    val br = System.`in`.bufferedReader()
    val t = br.readLine().toInt()
    val sb = StringBuffer()
    repeat(t) {
        var (n, d) = br.readLine().split(" ").map { it.toInt() }
        val original = Array(n) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }
        val res = Array(n) { IntArray(n) { 0 } }
        if (d < 0) {
            d += 360
        }
        for (i in 0 until n) {
            for (j in 0 until n) {
                res[i][j] = original[i][j]
            }
        }
        for (x in 0 until d / 45) {
            for (i in 0 until n) {
                res[i][n / 2] = original[i][i]
                res[i][i] = original[n / 2][i]
                res[n / 2][i] = original[n - 1 - i][i]
                res[n - 1 - i][i] = original[n - 1 - i][n / 2]
            }
            for (i in 0 until n) {
                for (j in 0 until n) {
                    original[i][j] = res[i][j]
                }
            }
        }
        res.forEach {
            it.forEach {
                sb.append("$it ")
            }
            sb.append("\n")
        }
    }
    println(sb)
    br.close()
}