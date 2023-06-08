fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val q = ArrayDeque<Int>()
    val res = mutableListOf<Int>()

    for (i in 1..n) {
        q.add(i)
    }

    while (q.isNotEmpty()) {
        for (i in 1 until k) {
            q.addLast(q.removeFirst())
        }
        res.add(q.removeFirst())
    }
    println("<${res.joinToString(", ")}>")
}