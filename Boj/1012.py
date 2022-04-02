from re import L


T = int(input())

for _ in range(0, T):
    M, N, K = map(int, input().split())
    graph = [[0 for _ in range(0, M)] for _ in range(0, N)]

    for i in range(0, K):
        x, y = map(int, input().split())
        graph[y][x] = 1

    print(graph)


def dfs(graph, start):
    visited = [[0 for _ in range(0, M)] for _ in range(0, N)]
    stack = [start]
    cnt = 0
    while stack:
        res = stack.pop()
        if res not in visited:
            print(graph[res[0]][res[1]])

            if graph[res[0]][res[1]] == 1:
                visited.append(res)
                print(cnt)
                cnt += 1
                if graph[res[0]+1][res[1]] == 1:
                    stack.append([res[0]+1, res[1]])
                elif graph[res[0]][res[1]+1] == 1:
                    stack.append([res[0], res[1]+1])
                elif graph[res[0]-1][res[1]] == 1:
                    stack.append([res[0]-1, res[1]])
                elif graph[res[0]][res[1]-1] == 1:
                    stack.append([res[0], res[1]+1])
            else:

    print(cnt)


dfs(graph, [0, 0])
