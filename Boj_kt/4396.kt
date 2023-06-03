fun main() {
    val n = readln().toInt()
    val mineMap = Array(n) { readln() }
    val playerMap = Array(n) { readln() }
    val resMap = Array(n) { IntArray(n) { 0 } }
    val finalMap = Array(n) { Array(n) { '.' } }
    var check = false
    val ny = intArrayOf(-1, 0, 1, -1, 1, -1, 0, 1)
    val nx = intArrayOf(1, 1, 1, 0, 0, -1, -1, -1)

    for (i in mineMap.indices) {
        for (j in mineMap[i].indices) {
            when (mineMap[i][j]) {
                '*' -> {
                    if (resMap[i][j] != -1) {
                        resMap[i][j] = -1
                    }
                    for (k in 0 until 8) {
                        if (j + nx[k] >= n || j + nx[k] < 0 || i + ny[k] >= n || i + ny[k] < 0) {
                            continue
                        }
                        if (resMap[i + ny[k]][j + nx[k]] != -1) {
                            resMap[i + ny[k]][j + nx[k]] += 1
                        }
                    }
                }
            }
        }
    }

    for (i in playerMap.indices) {
        for (j in playerMap[i].indices) {
            when (playerMap[i][j]) {
                'x' -> {
                    if (resMap[i][j] == -1) {
                        check = true
                        continue
                    }
                    finalMap[i][j] = resMap[i][j].digitToChar()
                }
            }
        }
    }
    if (check) {
        for (i in mineMap.indices) {
            for (j in mineMap[i].indices) {
                when (mineMap[i][j]) {
                    '*' -> {
                        finalMap[i][j] = '*'
                    }
                }
            }
        }

    }
    finalMap.forEach {
        it.forEach {
            print(it)
        }
        println()
    }
}