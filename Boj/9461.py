T = int(input())

N = []
data = [1, 1, 1, 2, 2]
for i in range(0, T):
    N.append(int(input()))

for i in range(5, max(N)):
    data.append(data[i-1]+data[i-5])

for i in range(0, T):
    print(data[N[i]-1])

# max(N)?? or   100
