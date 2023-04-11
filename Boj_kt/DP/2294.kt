fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val coins = IntArray(n) { readln().toInt() }

    val dp = IntArray(k + 1) { k + 1 }
    dp[0] = 0

    for (i in 1..k) {
        for (j in coins) {
            if (i - j >= 0)
                dp[i] = minOf(dp[i], dp[i - j] + 1)
        }
    }
    if (dp[k] == k + 1) println(-1)
    else println(dp[k])
}