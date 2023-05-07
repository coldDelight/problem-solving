fun main() {
    val br = System.`in`.bufferedReader()
    val sb = StringBuilder()
    val arr = IntArray(2000001)
    val n = br.readLine().toInt()

    for (i in 0 until n) {
        arr[br.readLine().toInt() + 1000000]++
    }

    var cnt = 0

    for (index in arr.indices) {
        if (cnt > n) {
            break
        }
        if (arr[index] > 0) {
            for (i in 0 until arr[index]) {
                sb.append("${index - 1000000}\n")
            }
            cnt++
        }
    }
    print(sb)
}