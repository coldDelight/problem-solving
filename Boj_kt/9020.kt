fun main() {
    val t = readln().toInt()
    val numbers = ArrayList<Int>()
    repeat(t){
        numbers.add(readln().toInt())
    }
    val max = numbers.maxOrNull()!!
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

    for (num in numbers){
        for (idx in num/2 ..num-2){
            if(isPrime[idx]&&isPrime[num-idx]){
                println("${num-idx} $idx")
                break
            }

        }
    }
}