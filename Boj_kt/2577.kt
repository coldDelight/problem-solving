fun main() {
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()
    val C = readLine()!!.toInt()
    val num = (A*B*C).toString()
    val res = mutableMapOf<Char,Int>()

    for(i in num){
        val tmp = res[i]?:0
        res[i]=tmp+1
    }
    repeat(10){
        println(res[it.digitToChar()]?:0)
    }
}