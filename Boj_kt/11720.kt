fun main() {
    val n  = readLine()!!.toInt()
    val number = readLine()!!
    var sum =0
    repeat(n){
        sum+= number[it].digitToInt()
    }
    print(sum)
}