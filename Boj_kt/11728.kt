fun main() {
    val br = System.`in`.bufferedReader()
    val sb = StringBuilder()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val a = br.readLine().split(" ").map { it.toInt() }
    val b = br.readLine().split(" ").map { it.toInt() }
    br.close()

    (a+b).sorted().forEach {
        sb.append("$it ")
    }

    println(sb)
}