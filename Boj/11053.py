N = int(input())
seq = list(map(int, input().split()))
dp = [0 for i in range(0, N)]


for i in range(0, N):
    dp[i] = 1
    for j in range(0, i):
        if seq[j] < seq[i]:
            dp[i] = max(dp[i], dp[j]+1)


print(max(dp))
