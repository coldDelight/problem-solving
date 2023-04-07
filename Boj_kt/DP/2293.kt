fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val coins = IntArray(n) { readln().toInt() }
    val dp = IntArray(k + 1) { 0 }
    dp[0] = 1

    for (i in 0 until n) {
        for (j in coins[i]..k) {
            dp[j] += dp[j - coins[i]]
        }
    }
    println(dp[k])
}