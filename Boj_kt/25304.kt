fun main() {
    val x = readLine()!!.toInt()
    val n = readLine()!!.toInt()
    var sum=0
    repeat(n){
        val item = readLine()!!.split(" ").map { it.toInt() }
        sum += item[0] * item[1]
    }
    if(sum == x){
        print("Yes")
    }else{
        print("No")
    }
}
