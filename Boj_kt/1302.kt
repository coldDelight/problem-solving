fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val bookList = HashMap<String, Int>()
    repeat(n) {
        val bookName = br.readLine()
        val tmp = bookList[bookName] ?: 0
        bookList[bookName] = tmp + 1
    }

    val maxCnt = bookList.values.maxOrNull()
    val maxVal = bookList.filter { it.value == maxCnt }.keys.sorted()[0]
    println(maxVal)

}