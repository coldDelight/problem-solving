fun main() {
    val n = readLine()!!.toInt()
    var score = readLine()!!.split(" ").map { it.toDouble() }
    val max = score.maxOrNull()!!.toDouble()
    var sum = 0.0
    score = score.map { it/ max *100 }
    repeat(n){
        sum+= score[it]
    }
    print(sum/n)
}