fun main() {
    val m = readln().toInt()
    val n = readln().toInt()
    var flag =true
    var sum =0
    var min = 0
    for(i in m..n){
        if(isPrime(i)){
            if(flag){
                min = i
                flag = false
            }
            sum+=i
        }
    }
    if(flag){
        println(-1)
    }else{
        println(sum)
        println(min)
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