fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val arr = BooleanArray(2000001)

    repeat(n) {
        arr[br.readLine().toInt() + 1000000] = true
    }
    br.close()

    val size = arr.size - 1
    for (i in arr.indices) {
        if (arr[size - i]) {
            bw.write("${size - i - 1000000}\n")
        }
    }

    bw.flush()
    bw.close()
}