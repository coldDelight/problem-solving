fun main() {
    val (n,money) = readln().split(" ").map{it.toInt()}
    val coin = IntArray(n){ readln().toInt() }
    var cnt =0
    var tmp = money
    repeat(n){
        cnt += tmp/coin[coin.size-it-1]
        tmp %= coin[coin.size - it-1]
    }
    print(cnt)
}