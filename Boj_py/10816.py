# 01.10 02:23 시작

N = int(input())

num = list(map(int, input().split()))
card_list = {}
for i in num:
    if i in card_list.keys():
        card_list[i] = card_list[i] + 1
    else:
        card_list[i] = 1

M = int(input())
target_list = map(int, input().split())

for i in target_list:
    if i in card_list.keys():
        print(card_list[i], end=" ")
    else:
        print(0, end=" ")

## 02:30 시간 초과
## 02:54  끝
