fun main(){
    val arr = readln()
    var cnt = 0
    for(i in arr){
        if(cnt%10 != 0 || cnt == 0 )
            print(i)
        else {
            println()
            print(i)
        }
        cnt++
    }
}