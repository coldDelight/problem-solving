fun main() {
    val (a, b) = readln().split(" ").map { it.toLong() }
    val res = a * b / gcd(a,b)

    print(res)
}
fun gcd(num1: Long, num2: Long): Long {
    if(num2==0L){
        return num1
    }else{
        return gcd(num2,num1%num2)
    }
}