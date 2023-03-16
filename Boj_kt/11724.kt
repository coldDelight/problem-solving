fun main() {
    val (v, edge) = readln().split(" ").map { it.toInt() }
    val graph = Array<ArrayList<Int>>(v + 1) { arrayListOf() }
    val visited = BooleanArray(v + 1) { false }
    var cnt = 0

    repeat(edge) {
        val (v1, v2) = readln().split(" ").map { it.toInt() }
        graph[v1].add(v2)
        graph[v2].add(v1)
    }

    for (i in 1..v) {
        if (!visited[i]) {
            cnt++
            dfs(graph, i, visited)
        }
    }
    print(cnt)
}

fun dfs(graph: Array<ArrayList<Int>>, v: Int, visited: BooleanArray) {
    visited[v] = true
    graph[v].forEach {
        if (!visited[it]) {
            dfs(graph, it, visited)
        }
    }
}