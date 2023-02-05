fun main(args: Array<String>) {
    val n = readln().toInt()
    repeat(n){
        val (num1, num2) =readln().split(" ").map { it.toInt() }
        println(num1*num2/ gcd(num1,num2))
    }
}

fun gcd(num1: Int, num2: Int): Int {
    if(num2==0){
        return num1
    }else{
        return gcd(num2,num1%num2)
    }
}