fun main() {
    val n = readln().toInt()
    val num = readln().split(" ").map { it.toInt() }
    var cnt =0
    for(i in num){
        if(isPrime(i)){
            cnt++
        }
    }
    print(cnt)
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