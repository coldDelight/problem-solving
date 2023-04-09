
fun main() {
    val br = System.`in`.bufferedReader()
    val (n, m, v) = readln().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { ArrayList<Int>() }

    val visitedDfs = BooleanArray(n + 1) { false }
    val visitedBfs = BooleanArray(n + 1) { false }

    repeat(m) {
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }
        graph[v1].add(v2)
        graph[v2].add(v1)
    }
    br.close()

    graph.forEach {
        it.sort()
    }


    dfs(graph, v, visitedDfs)
    println()
    bfs(graph, v, visitedBfs)
}

fun dfs(graph: Array<ArrayList<Int>>, v: Int, visited: BooleanArray) {
    visited[v] = true
    print("$v ")
    graph[v].forEach {
        if (!visited[it]) {
            dfs(graph, it, visited)
        }
    }
}

fun bfs(graph: Array<ArrayList<Int>>, v: Int, visited: BooleanArray) {
    val q = ArrayDeque<Int>()
    q.addFirst(v)
    visited[v] = true
    while (q.isNotEmpty()) {
        val x = q.removeLast()
        print("$x ")
        graph[x].forEach {
            if (!visited[it]) {
                q.addFirst(it)
                visited[it] = true
            }
        }
    }
}