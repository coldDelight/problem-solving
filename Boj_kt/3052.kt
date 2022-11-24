fun main() {
    val numArr = arrayListOf<Int>()
    repeat(10){
        numArr.add(readLine()!!.toInt()%42)
    }
    print(numArr.toSet().size)
}