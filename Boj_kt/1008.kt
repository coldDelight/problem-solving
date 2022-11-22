fun main(){
    val num = readLine()!!.split(" ").map { it.toDouble() }
    print(num[0]/num[1])
}