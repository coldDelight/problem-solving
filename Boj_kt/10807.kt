fun main() {
    val n = readLine()!!.toInt()
    val number = readLine()!!.split(" ").map { it.toInt() }
    val target = readLine()!!.toInt()
    var cnt:Int=0
    repeat(n){
        if(number[it]==target){
            cnt++
        }
    }
    print(cnt)
}
