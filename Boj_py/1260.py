
N, M, V = map(int, input().split())

graph = {}

for i in range(1, N+1):
    graph[i] = []

for i in range(0, M):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)


def dfs(graph, start):
    visited = []
    stack = [start]
    while stack:
        v = stack.pop()
        if v not in visited:
            visited.append(v)
            print(v, end=" ")
            for w in graph[v]:
                stack.append(w)


for i in graph.keys():
    graph[i].sort(reverse=True)  # sort()랑 reverse()다르다!

dfs(graph, V)
print()


def bfs(graph, start):
    visited = [start]
    queue = [start]
    while queue:
        v = queue.pop(0)
        for w in graph[v]:
            if w not in visited:
                visited.append(w)
                print(w, end=" ")
                queue.append(w)


for i in graph.keys():
    graph[i].sort()


print(V, end=" ")
bfs(graph, V)
