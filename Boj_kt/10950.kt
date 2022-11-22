fun main() {
    val t = readLine()!!.toInt()
    repeat(t){
        val number = readLine()!!.split(" ").map { it.toInt() }
        println(number[0]+number[1])
    }
}
