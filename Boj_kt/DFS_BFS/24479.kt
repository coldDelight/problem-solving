fun main() {
    val br = System.`in`.bufferedReader()
    val (n, m, r) = readln().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { ArrayList<Int>() }
    val visited = IntArray(n + 1) { 0 }
    val cnt = IntArray(1) { 1 }
    repeat(m) {
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }
        graph[v1].add(v2)
        graph[v2].add(v1)
    }
    graph.forEach {
        it.sort()
    }
    dfs(graph, r, visited,cnt)
    visited.forEachIndexed { index, value ->
        if (index!=0){
            println(value)
        }
    }
    br.close()
}

fun dfs(graph: Array<ArrayList<Int>>, v: Int, visited: IntArray, cnt: IntArray) {
    visited[v] = cnt[0]++
    graph[v].forEach {
        if (visited[it] == 0) {
            dfs(graph, it, visited, cnt)
        }
    }
}