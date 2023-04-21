fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val arr1 = br.readLine().split(" ").map { it.toInt() }.sorted()
    val m = br.readLine().toInt()
    val arr2 = br.readLine().split(" ").map { it.toInt() }
    
    br.close()
    for (i in 0 until m) {
        val find = arr2[i]
        var end = n - 1
        var start = 0
        var res = 0
        var mid = (start + end) / 2

        while (start <= end) {
            if (arr1[mid] == find) {
                res = 1
                break
            } else if (arr1[mid] > find) {
                end = mid - 1
            } else {
                start = mid + 1
            }
            mid = (start + end) / 2
        }
        bw.write("$res")
        bw.newLine()
    }
    bw.flush()
    bw.close()
}