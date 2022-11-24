fun main() {
    val n = readLine()!!.toInt()
    var number = 0
    var cnt=0
    number = n
    while(true){
        val num1 = number/10
        val num2 = number%10
        number = num2 + num1
        number = (num2*10) + (number%10)
        cnt++
        if(number == n){
            break
        }
    }
    print(cnt)
}