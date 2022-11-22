fun main(){
    val number1 = readLine()!!.toInt()
    val number2 = readLine()
    println(number2!![2].digitToInt() *number1)
    println(number2[1].digitToInt() *number1)
    println(number2[0].digitToInt() *number1)
    print(number2.toInt() * number1)
}