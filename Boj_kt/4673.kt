fun main() {
    val resSelf :MutableSet<Int> = mutableSetOf()

    repeat(10000){
        checkSelf(it+1,resSelf)
    }
    repeat(10000){
        if (!resSelf.contains(it+1)){
            println(it+1)
        }
    }
}
fun checkSelf(n:Int,resSelf:MutableSet<Int>){
    var sum = n
    repeat(n.toString().length){
        sum+=n.toString()[it].digitToInt()
    }
    resSelf.add(sum)
}