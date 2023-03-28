fun main() {
    val n = readln().toInt()

    val graph = Array(n) { readln().split(" ").map { it.toInt() }.toIntArray() }
    val dp = Array(n) { LongArray(n) { 0L } }

    dp[0][0] = 1

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i + j == (2 * n) - 2) {
                break
            } else {
                val step = graph[i][j]
                if (i + step < n) {
                    dp[i + step][j] += dp[i][j]
                }
                if (j + step < n) {
                    dp[i][j + step] += dp[i][j]
                }
            }
        }
    }
    println(dp[n-1][n-1])
}