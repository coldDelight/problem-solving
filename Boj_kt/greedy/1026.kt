fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }.sorted()
    val b = readln().split(" ").map { it.toInt() }.sorted()

    val s = a.mapIndexed { index, value -> value * b[(n - 1) - index] }

    print(s.sum())
}