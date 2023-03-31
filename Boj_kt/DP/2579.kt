fun main() {
    val n = readln().toInt()
    val score = IntArray(n + 1) { 0 }
    val dp = IntArray(n + 1) { 0 }

    repeat(n) {
        score[it + 1] = readln().toInt()
    }

    dp[0] = 0
    if(n>0){
        dp[1] = score[1]
    }
    if(n>1){
        dp[2] = score[1] + score[2]
    }

    for (i in 3 .. n) {
        dp[i] = maxOf(score[i] + dp[i - 2], score[i] + score[i - 1] + dp[i - 3])
    }

    println(dp[n])
}