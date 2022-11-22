fun main(){
    val number = readLine()!!.split(" ").map { it.toInt() }
    println("${(number[0]+number[1])%number[2]}")
    println("${((number[0]%number[2])+(number[1]%number[2]))%number[2]}")
    println("${(number[0]*number[1])%number[2]}")
    println("${((number[0]%number[2])*(number[1]%number[2]))%number[2]}")
}