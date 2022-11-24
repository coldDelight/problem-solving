fun main() {
    val numArr = arrayListOf<Int>()
    repeat(9){
        numArr.add(readLine()!!.toInt())
    }
    println(numArr.maxOrNull())
    println(numArr.indexOf(numArr.maxOrNull())+1)
}