fun main() {
    val br = System.`in`.bufferedReader()

    val s = br.readLine()
    var t = br.readLine()
    br.close()

    var res = 0
    var lastIndex = t.length - 1

    while (true) {
        if (t == s) {
            res = 1
            break
        }
        if (t.length == 1) break

        if (t[lastIndex] == 'A') t = t.substring(0, lastIndex)
        else if (t[lastIndex] == 'B') t = (t.substring(0, lastIndex)).reversed()

        lastIndex = t.length - 1

    }
    println(res)
}