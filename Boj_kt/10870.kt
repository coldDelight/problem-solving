fun main() {
    val num = readln().toInt()
    val tmp = cal(num)
    print(tmp)
}

fun cal(num:Int): Int{
    if(num<2){
        return num
    }else{
        return cal(num-1) + cal (num-2)
    }
}