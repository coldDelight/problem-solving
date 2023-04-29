fun main() {
    val br = System.`in`.bufferedReader()
    val arr = Array(5) { Array(15) { "_" } }
    repeat(5) {
        val str = br.readLine()
        val charList = str.split("").filter { it != "" }
        charList.forEachIndexed { index, value ->
            arr[it][index] = value
        }
    }
    br.close()
    for (i in 0 until 15) {
        for (j in 0 until 5) {
            if (arr[j][i] != "_") {
                print(arr[j][i])
            }
        }
    }
}