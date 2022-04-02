# 01.13 02:10

N, r, c = map(int, input().split())

val = 0

while N != 0:
    N -= 1

    if r < 2 ** N and c < 2 ** N:
        val += (2 ** N) * (2 ** N) * 0

    elif r < 2 ** N and c >= 2 ** N:
        val += (2 ** N) * (2 ** N) * 1
        c -= (2 ** N)

    elif r >= 2 ** N and c < 2 ** N:
        val += (2 ** N) * (2 ** N) * 2
        r -= (2 ** N)

    else:
        val += (2 ** N) * (2 ** N) * 3
        r -= (2 ** N)
        c -= (2 ** N)
print(val)
# 03:01
