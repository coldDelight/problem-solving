fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (a, b) = readln().split(",").map { it.toInt() }
        println(a+b)
    }
}