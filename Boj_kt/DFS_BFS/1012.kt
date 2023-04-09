fun main() {
    val br = System.`in`.bufferedReader()
    val t = br.readLine().toInt()

    repeat(t) {
        val (m, n, k) = br.readLine().split(" ").map { it.toInt() }
        val graph = Array(m) { IntArray(n) { 0 } }
        val visited = Array(m) { BooleanArray(n) { false } }
        var cnt = 0

        for (i in 0 until k) {
            val (x, y) = br.readLine().split(" ").map { it.toInt() }
            graph[x][y] = 1
        }

        for (i in 0 until m) {
            for (j in 0 until n) {
                if (!visited[i][j]&&graph[i][j]==1) {
                    bfs(graph, i, j, visited, m to n)
                    cnt++
                }
            }
        }
        println(cnt)
    }
    br.close()
}

fun bfs(graph: Array<IntArray>, x: Int, y: Int, visited: Array<BooleanArray>, size: Pair<Int, Int>){
    val q = ArrayDeque<Pair<Int, Int>>()
    val dx = intArrayOf(1, 0, -1, 0)
    val dy = intArrayOf(0, 1, 0, -1)

    q.addFirst(x to y)
    visited[x][y] = true

    while (q.isNotEmpty()) {
        val tmp = q.removeLast()
        for (i in 0 until 4) {
            val nx = tmp.first + dx[i]
            val ny = tmp.second + dy[i]
            if (nx < 0 || nx >= size.first || ny < 0 || ny >= size.second) {
                continue
            } else if (graph[nx][ny] == 0 || visited[nx][ny]) {
                continue
            } else if (graph[nx][ny] == 1) {
                q.addFirst(nx to ny)
                visited[nx][ny] = true
            }
        }
    }
}