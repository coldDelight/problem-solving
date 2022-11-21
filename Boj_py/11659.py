# 01.10 02:56 시작
N, M = map(int, input().split())

num_list = list(map(int, input().split()))
sum_data = [0]

sum = 0
for i in num_list:
    sum += i
    sum_data.append(sum)

for i in range(M):
    start, end = map(int, input().split())
    print(sum_data[end] - sum_data[start - 1])

# 03:10 시간초과
# 03:27 채점 시간 왜 이렇게 오래걸려ㅕㅕㅕ
# 03:35 끝
