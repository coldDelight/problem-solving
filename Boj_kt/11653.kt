fun main() {
    var num = readln().toInt()
    var cnt =2
    while(num>1){
        if(num % cnt ==0){
            println(cnt)
            num /= cnt
        }else{
            cnt++
        }
    }
}