fun main() {
    val br = System.`in`.bufferedReader()
    val deque = ArrayDeque<Int>()
    val n = readln().toInt()
    val sb = StringBuffer()

    repeat(n) {
        val inputData = br.readLine().split(" ")
        when (inputData[0]) {
            "push_back" -> deque.addLast(inputData[1].toInt())
            "push_front" -> deque.addFirst(inputData[1].toInt())
            "pop_front" -> sb.append("${deque.removeFirstOrNull() ?: -1}\n")
            "pop_back" -> sb.append("${deque.removeLastOrNull() ?: -1}\n")
            "size" -> sb.append("${deque.size}\n")
            "empty" -> sb.append("${if (deque.isEmpty()) "1" else "0"}\n")
            "front" -> sb.append("${deque.firstOrNull() ?: "-1"}\n")
            "back" -> sb.append("${deque.lastOrNull() ?: "-1"}\n")
        }
    }
    print(sb.toString())
    br.close()
}