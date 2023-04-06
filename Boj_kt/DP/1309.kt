fun main() {
    val n = readln().toInt()
    val dp = IntArray(n + 1) { 0 }
    dp[0] = 1
    dp[1] = 3

    for (i in 2..n) {
        dp[i] = ((dp[i - 1] * 2) + dp[i - 2]) % 9901
    }
    println(dp[n])
}