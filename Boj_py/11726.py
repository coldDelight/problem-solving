# 01.10 03:36 시작

N = int(input())

data = [1, 2]

for i in range(2, N):

    data.append(data[i - 1] + data[i - 2])
if N == 1:
    print(1)
else:
    print(data[-1] % 10007)

# 04:14 끝
