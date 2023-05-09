fun main() {
    val br = System.`in`.bufferedReader()
    val sb = StringBuilder()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = IntArray(n + 1) { it }
    repeat(m) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        val tmp = arr[a]
        arr[a] = arr[b]
        arr[b] = tmp
    }
    for (i in arr.indices) {
        if (i != 0) {
            sb.append("${arr[i]} ")
        }
    }
    print(sb)
}