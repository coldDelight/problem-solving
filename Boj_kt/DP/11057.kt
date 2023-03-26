fun main() {
    val n = readln().toInt()
    val dp = Array(n + 1) { IntArray(10) }

    for (i in 0 until 10) {
        dp[1][i] = 1
    }

    for (i in 2..n) {
        for (j in 0 until 10) {
            for (k in 0..j) {
                dp[i][j] = (dp[i][j] + dp[i - 1][k]) % 10007
            }
        }

    }
    println(dp[n].sum() % 10007)
}