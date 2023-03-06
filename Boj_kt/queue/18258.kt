import java.util.LinkedList

fun main() {
    val br = System.`in`.bufferedReader()
    val q = LinkedList<Int>()
    val n = readln().toInt()
    val sb = StringBuffer()

    repeat(n) {
        val inputData = br.readLine().split(" ")
        when (inputData[0]) {
            "push" -> q.add(inputData[1].toInt())
            "pop" -> if (q.isEmpty()) sb.append("-1\n") else sb.append("${q.removeFirst()}\n")
            "size" -> sb.append("${q.size}\n")
            "empty" -> if (q.isEmpty()) sb.append("1\n") else sb.append("0\n")
            "front" -> if (q.isEmpty()) sb.append("-1\n") else sb.append("${q.first}\n")
            "back" -> if (q.isEmpty()) sb.append("-1\n") else sb.append("${q.last}\n")
        }
    }
    print(sb.toString())
    br.close()
}