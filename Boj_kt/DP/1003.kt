fun main() {
    val t = readln().toInt()
    val dp = Array(41) { IntArray(2) { 0 } }

    dp[0][0] = 1
    dp[1][1] = 1
    fibonacci(dp)

    repeat(t) {
        val x = readln().toInt()
        println("${dp[x][0]} ${dp[x][1]}")
    }
}

fun fibonacci(dp: Array<IntArray>) {
    for (i in 2 until 41) {
        dp[i] = intArrayOf(dp[i - 1][0] + dp[i - 2][0], dp[i - 1][1] + dp[i - 2][1])
    }
}