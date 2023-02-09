fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val a = mutableSetOf<Int>()
    val b = mutableSetOf<Int>()
    val c = mutableSetOf<Int>()

    readln().split(" ").map {
        a.add(it.toInt())
        c.add(it.toInt())
    }
    readln().split(" ").map { b.add(it.toInt()) }
    a.removeAll(b)
    b.removeAll(c)
    println(a.size + b.size)
}