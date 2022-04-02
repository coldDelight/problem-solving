N, M = map(int, input().split())

graph = [[] for _ in range(0, N)]
visited = [False for _ in range(N)]
cnt = 0

for i in range(0, M):
    u, v = map(lambda x: int(x)-1, input().split())
    graph[u].append(v)
    graph[v].append(u)


def dfs(graph, start, visited):
    visited[start] = True

    for i in graph[start]:
        if not visited[i]:
            dfs(graph, i, visited)


for i in range(0, len(visited)):
    if visited[i] == False:
        cnt += 1
        dfs(graph, i, visited)

print(cnt)
# 변수명 추천
# 인접 행렬 노드개수 많을 수록 메모리 낭비
# 인접 리스트 메모리 효율 노드연결 정보 얻는 속도 느리다
