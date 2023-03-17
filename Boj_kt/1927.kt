import java.util.PriorityQueue

fun main() {
    val priorityQueue = PriorityQueue<Int>()
    val br = System.`in`.bufferedReader()
    val sb = StringBuffer()
    val n = br.readLine().toInt()
    repeat(n) {
        val x = br.readLine().toInt()
        if (x == 0) {
            sb.append(priorityQueue.poll() ?: 0)
            sb.append("\n")
        } else {
            priorityQueue.add(x)
        }
    }
    print(sb)
    br.close()
}