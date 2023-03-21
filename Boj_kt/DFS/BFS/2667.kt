fun main() {
    val n = readln().toInt()
    val graph = Array(n) { readln().map { it.digitToInt() }.toIntArray() }
    val visited = Array(n) { BooleanArray(n) { false } }
    val cntTot = HashMap<Int, Int>()
    var cnt = 0
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (graph[i][j] == 0) {
                continue
            }
            if (!visited[i][j]) {
                cnt++
                bfs(graph, visited, i, j, n, cnt)
            }
        }
    }

    graph.forEach {
        it.forEach { it1 ->
            if (it1 != 0) {
                val tmp = cntTot[it1] ?: 0
                cntTot[it1] = tmp + 1
            }
        }
    }

    println(cnt)
    cntTot.values.sorted().forEach {
        println(it)
    }
}

fun bfs(graph: Array<IntArray>, visited: Array<BooleanArray>, x: Int, y: Int, size: Int, num: Int) {

    val q = ArrayDeque<Pair<Int, Int>>()
    val dx = intArrayOf(0, 0, 1, -1)
    val dy = intArrayOf(1, -1, 0, 0)
    q.addFirst(x to y)
    graph[x][y] = num
    visited[x][y] = true

    while (q.isNotEmpty()) {
        val tmp = q.removeLast()
        for (i in 0 until 4) {
            val nx = tmp.first + dx[i]
            val ny = tmp.second + dy[i]

            if (nx < 0 || nx >= size || ny < 0 || ny >= size) {
                continue
            } else if (graph[nx][ny] == 0 || visited[nx][ny]) {
                continue
            }
            q.addFirst(nx to ny)
            graph[nx][ny] = num
            visited[nx][ny] = true
        }
    }
}