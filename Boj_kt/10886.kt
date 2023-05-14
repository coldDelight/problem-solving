fun main() {
    val n = readln().toInt()
    var cnt =0
    repeat(n) {
        val x = readln().toInt()
        if (x==1){
            cnt+=1
        }else{
            cnt-=1
        }
    }
    if (cnt<0){
        print("Junhee is not cute!")
    }else{
        print("Junhee is cute!")
    }
}