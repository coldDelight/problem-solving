fun main(){
    val num = readLine()!!.split(" ").map { it.toInt() }
    print(num[0]-num[1])
}