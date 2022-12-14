import kotlin.math.abs

fun main() {
    val n = readLine()!!.toInt()
    var cnt =0
    repeat(n){
        cnt += isHan(it+1)
    }
    print(cnt)

}

fun isHan(num:Int):Int{
    when(num){
        in 1..99-> return 1
        1000-> return 0
        else->{
            val a = num%10
            val b = (num/10)%10
            val c = (num/100)%10
            if(a==b && b==c){
                return 1
            }
            if(a!=c){
                if(abs(c-b)==abs(b-a)){
                    return 1
                }else{
                    return 0
                }
            }
            return 0
        }
    }
}