n = int(input())
tmp = []
for i in str(n):
    tmp.append(int(i))

tmp.sort(reverse=True)  # 내림차순
for i in tmp:
    print(i, end='')
