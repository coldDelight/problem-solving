fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val graph = Array(n) { readln().map { it.digitToInt() }.toIntArray() }
    val visited = Array(n) { BooleanArray(m) { false } }

    bfs(graph, visited, n, m)
}

fun bfs(graph: Array<IntArray>, visited: Array<BooleanArray>, n: Int, m: Int) {
    val dx = arrayListOf(-1, 0, 1, 0)
    val dy = arrayListOf(0, -1, 0, 1)
    val q = ArrayDeque<Pair<Int, Int>>()

    q.addFirst(0 to 0)
    visited[0][0] = true

    while (q.isNotEmpty()) {
        val tmp = q.removeLast()

        for (i in 0 until 4) {
            val nx = tmp.first + dx[i]
            val ny = tmp.second + dy[i]
            if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
            if (visited[nx][ny] || graph[nx][ny] == 0) continue

            q.addFirst(nx to ny)
            graph[nx][ny] = graph[tmp.first][tmp.second] + 1
            visited[nx][ny] = true
        }
    }
    println(graph[n - 1][m - 1])
}