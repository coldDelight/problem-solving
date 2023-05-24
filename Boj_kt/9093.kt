fun main() {
    val t = readln().toInt()
    val br = System.`in`.bufferedReader()
    val sb = StringBuffer()

    repeat(t) {
        val str = br.readLine().split(" ")
        for (i in str) {
            sb.append("${i.reversed()} ")
        }
        sb.append("\n")
    }
    println(sb)
}