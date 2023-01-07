fun main() {
    var num = -1
    val max = 123456 * 2
    val isPrime = BooleanArray(max + 1) { true }

    isPrime[0] = false
    isPrime[1] = false

    var i = 2

    while (i * i <= max) {
        if (isPrime[i]) {
            var j = i * i
            while (j <= max) {
                isPrime[j] = false
                j += i
            }
        }
        i++
    }
    while (true) {
        num = readln().toInt()
        if (num == 0) {
            break
        } else {
            println(isPrime.slice(num + 1..num * 2).count { it })
        }
    }
}