fun main() {
    val arr = IntArray(7) { readln().toInt() }
    val numbers = mutableListOf<Int>()

    arr.forEach {
        if (it % 2 == 1) {
            numbers.add(it)
        }
    }
    if (numbers.isEmpty()) {
        println(-1)
    } else {
        println(numbers.sum())
        println(numbers.minOrNull())
    }
}