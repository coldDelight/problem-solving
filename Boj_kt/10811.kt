fun main() {
    val br = System.`in`.bufferedReader()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = IntArray(n) { it + 1 }

    repeat(m) {
        val (start, end) = br.readLine().split(" ").map { it.toInt() }
        arr.reverse(start-1,end)
    }
    br.close()

    arr.forEach {
        print("$it ")
    }
}