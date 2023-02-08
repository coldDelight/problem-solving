fun main() {
    val (n,m) = readln().split(" ").map { it.toInt() }
    val heard = mutableSetOf<String>()
    val seen = mutableSetOf<String>()
    repeat(n) {
        heard.add(readln())
    }
    repeat(m) {
        seen.add(readln())
    }
    val both = heard.intersect(seen)
    val result = both.toSortedSet()
    println("${result.size}")
    for (name in result) {
        println(name)
    }
}