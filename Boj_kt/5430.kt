fun main() {
    val br = System.`in`.bufferedReader()
    val sb = StringBuffer()
    val t = br.readLine().toInt()

    repeat(t) {
        val cmd = br.readLine()
        val num = br.readLine().toInt()
        val arr = ArrayDeque(br.readLine().drop(1).dropLast(1).split(","))
        var isReverse = false
        var isNotErr = true

        if (arr[0]==""){
            arr.clear()
        }

        for (i in cmd) {
            when (i) {
                'R' -> {
                    isReverse = !isReverse
                }
                'D' -> {
                    if (arr.isNotEmpty()) {
                        if (isReverse) {
                            arr.removeLast()
                        } else {
                            arr.removeFirst()
                        }
                    } else {
                        isNotErr = false
                        sb.append("error\n")
                        break
                    }
                }
            }
        }
        if (isNotErr) {
            if (isReverse) {
                arr.reverse()
            }
            sb.append(arr.toString().replace(", ",","))
            sb.append("\n")
        }
    }
    br.close()
    print(sb.toString())
}