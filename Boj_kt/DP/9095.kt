fun main() {
    val t = readln().toInt()
    repeat(t) {
        val n = readln().toInt()
        val dp = IntArray(n + 1) { 0 }
        when (n) {
            1 -> println(1)
            2 -> println(2)
            3 -> println(4)
            else -> {
                dp[1] = 1
                dp[2] = 2
                dp[3] = 4
                
                for (i in 4..n) {
                    dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
                }
                println(dp[n])
            }
        }
    }
}