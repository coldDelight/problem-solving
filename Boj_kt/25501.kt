fun main() {
    val num = readln().toInt()
    repeat(num){
        val str = readln()
        val isPal = isPalindrome(str)
        println("${isPal.first} ${isPal.second}")
    }
}

fun recursion(s:String,i:Int,r:Int,cnt:Int):Pair<Int,Int>{
    if(i>=r){
        return Pair(1,cnt)
    }else if(s[i]!=s[r]){
        return Pair(0,cnt)
    }else{
        return recursion(s,i+1,r-1,cnt+1)
    }
}
fun isPalindrome(s:String): Pair<Int,Int>{
    return recursion(s,0,s.length-1,1)
}