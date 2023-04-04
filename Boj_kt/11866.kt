fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val q = ArrayDeque<Int>()
    val sb = StringBuffer()

    sb.append("<")

    for (i in 1..n) {
        q.addFirst(i)
    }

    while (q.isNotEmpty()) {
        for (i in 0 until k - 1) {
            q.addFirst((q.removeLast()))
        }
        if (q.size == 1) {
            sb.append("${q.removeLast()}>")
        } else {
            sb.append("${q.removeLast()}, ")
        }
    }
    println(sb)
}