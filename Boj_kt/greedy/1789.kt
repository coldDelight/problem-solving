fun main() {
    var num = readln().toLong()
    var cnt = 0L
    var i = 1L

    while (0 <= num) {
        num -= i
        cnt++
        i++
    }
    print(cnt - 1)
}

//1. 1부터 순서대로 올라가면서 올라가는게 가장 최대
//2. 어딘가에서 중복이 생김
//3. 하나씩 빼서 0보다 작아지면 무조건 cnt에서 1빼면 답인가