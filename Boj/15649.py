# 01.13 01:17 ㅅㅣㅈ
def makeNum():
    if len(val) == M:
        for i in val:
            print(i, end=" ")
        print()
        return

    for i in range(1, N+1):
        if i not in val:
            val.append(i)
            makeNum()
            val.pop()


N, M = map(int, input().split())

val = []
makeNum()
# 02:03 ㄲㅡㅌ
