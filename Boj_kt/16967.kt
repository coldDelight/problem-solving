fun main() {
    val (h, w, x, y) = readln().split(" ").map { it.toInt() }
    val arr = Array(h + x) { IntArray(w + y) { 0 } }
    val res = Array(h) { IntArray(w) { 0 } }

    repeat(h) {
        val tmp = readln().split(" ").map { it.toInt() }
        tmp.forEachIndexed { index, value ->
            arr[it][index] = value
        }
    }

    for (i in 0 until h) {
        for (j in 0 until w) {
            res[i][j] = arr[i][j]
        }
    }
    for (i in x until h) {
        for (j in y until w) {
            res[i][j] = arr[i][j] - res[i - x][j - y]
        }
    }
    res.forEach {
        it.forEach {
            print("$it ")
        }
        println()
    }
}