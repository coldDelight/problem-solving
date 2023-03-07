fun main() {
    val n = readln().toInt()
    val q = ArrayDeque<Int>()
    repeat(n) {
        q.add(it + 1)
    }
    while (q.size != 1) {
        q.removeFirst()
        q.add(q.removeFirst())
    }
    print(q.first())
}