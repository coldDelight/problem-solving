fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val graph = Array(n) { readln().split(" ").map { it.toInt() }.toIntArray() }

    val dp = Array(n + 1) { IntArray(m + 1) { 0 } }

    for (i in 1..n) {
        for (j in 1..m) {
            val tmp = arrayListOf(dp[i - 1][j], dp[i][j - 1], dp[i - 1][j - 1]).maxOrNull()
            if (tmp != null) {
                dp[i][j] = tmp  + graph[i-1][j-1]
            }
        }
    }
    println(dp[n][m])
}