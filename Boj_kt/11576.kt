import kotlin.math.pow


fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val m = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }

    var ten = 0
    val res = mutableListOf<String>()
    for (i in 0 until m) {
        ten += arr[i] * a.toDouble().pow(m - i - 1).toInt()
    }
    while (ten > 0) {
        val nam = ten % b
        res.add(nam.toString())
        ten /= b
    }
    println(res.reversed().joinToString(" "))
}