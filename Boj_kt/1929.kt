fun main() {
    val num = readln().split(" ").map { it.toInt() }
    for(i in num[0]..num[1]){
        if(isPrime(i)){
            println(i)
        }
    }
}

fun isPrime(num:Int):Boolean{
    if(num==1){
        return false
    }
    var i =2
    while (i*i<=num){
        if(num%i++==0){
            return false
        }
    }
    return true
}