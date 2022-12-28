fun main() {
    val t = readln().toInt()
    repeat(t){
        val (h,w,n) = readln().split(" ").map { it.toInt() }
        var f=0
        var ho=0
        if(n%h==0){
            f = h*100
            ho = n/h
        }else{
            f = (n%h)*100
            ho = 1+(n/h)
        }
        println(f+ho)
    }
}