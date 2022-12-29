fun main() {
    val t = readln().toInt()
    repeat(t){
        val k = readln().toInt()
        val n = readln().toInt()
        val tmp = mutableListOf<Int>()
        for(i in 1..n+1){
            tmp.add(i-1,i)
        }
        repeat(k){
            for(i in 1..n){
                tmp[i] += tmp[i-1]
            }
        }
        println(tmp[tmp.size-2])
    }
}