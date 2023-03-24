fun main() {
    val n = readln().toInt()
    val dp = IntArray(n + 1) { 0 }

    dp[1] = 1

    for (i in 2..n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }
    println("${dp[n]}")
}