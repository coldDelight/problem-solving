fun main() {
    val n = readln().toInt()
    val dp = LongArray(n+1) { 0 }

    dp[0] = 0
    for (i in 0 .. n) {
        when (i) {
            0 -> dp[0] = 0
            1 -> dp[1] = 1
            else -> dp[i] = dp[i-1]+dp[i-2]
        }
    }
    println(dp[n])
}