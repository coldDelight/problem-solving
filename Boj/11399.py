N = int(input())

piList = list(map(int, input().split()))


piList.sort()


sum = 0
tot = 0
for i in piList:
    sum += i
    tot += sum


print(tot)
# 그냥 pi리스트 정렬 후 계산
