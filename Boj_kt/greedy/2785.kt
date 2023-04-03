fun main() {
    val n = readln().toInt()
    var cnt = 0
    val chains = readln().split(" ").map { it.toInt() }.sorted().toMutableList()

    while (true) {
        if (chains.size<=1){
            break
        }
        chains[0] -= 1
        chains.removeLastOrNull()
        cnt++
        if (chains.firstOrNull() == 0) {
            chains.removeFirst()
        }
    }
    println(cnt)
}