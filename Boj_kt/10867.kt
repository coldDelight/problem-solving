fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val arr = BooleanArray(2001)

    val numbers = br.readLine().split(" ").map { it.toInt() }
    repeat(n) {
        if (!arr[numbers[it] + 1000]) {
            arr[numbers[it] + 1000] = true
        }
    }
    br.close()

    for (i in arr.indices) {
        if (arr[i]) {
            bw.write("${i - 1000} ")
        }
    }
    bw.flush()
    bw.close()
}