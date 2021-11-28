N = int(input())

time = []

for i in range(0, N):
    x, y = map(int, input().split())
    time.append([x, y])

time.sort()
time = sorted(time, key=lambda a: a[1])

end = 0
cnt = 0

for i, j in time:
    if i >= end:
        cnt += 1
        end = j


print(cnt)
