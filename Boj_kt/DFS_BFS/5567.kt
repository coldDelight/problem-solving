fun main() {
    val n = readln().toInt()
    val m = readln().toInt()
    val graph = Array(n + 1) { mutableListOf<Int>() }
    val visited = BooleanArray(n + 1) { false }

    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }
    visited[1] = true
    for (i in graph[1]) {
        visited[i] = true
        for (j in graph[i]) {
            if (visited[j]) {
                continue
            } else {
                visited[j] = true
            }
        }
    }
    print(visited.count { it } - 1)
}
