fun main(){
    val total = readLine()!!.split(" ").map { it.toInt() }
    val base = arrayListOf<Int>(1,1,2,2,2,8)
    total.mapIndexed { index, num ->
        print("${base[index]-num} ")
    }
}