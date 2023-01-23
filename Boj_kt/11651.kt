fun main() {
    val num = readln().toInt()
    val tmp = mutableListOf<Pair<Int,Int>>()

    repeat(num){
        val (x,y) = readln().split(" ").map { it.toInt() }
        tmp.add(Pair(x,y))
    }
    val sorted = tmp.sortedWith(compareBy({ it.second }, { it.first }))
    repeat(num){
        println("${sorted[it].first} ${sorted[it].second}")
    }
}
