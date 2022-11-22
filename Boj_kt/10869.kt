fun main(){
    val num = readLine()!!.split(" ").map { it.toInt() }
    println(num[0]+num[1])
    println(num[0]-num[1])
    println(num[0]*num[1])
    println(num[0]/num[1])
    print(num[0]%num[1])
}