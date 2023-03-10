import java.math.BigInteger

val bw = System.out.bufferedWriter()

fun main() {
    val n = readln().toInt()
    bw.write("${(BigInteger("2").pow(n).subtract(BigInteger.ONE))}")
    bw.newLine()
    if (n <= 20) {
        hanoi(n, 1, 3, 2)
    }
    bw.flush()
    bw.close()
}

fun hanoi(n: Int, from: Int, to: Int, tmp: Int) {
    if (n == 1) {
        bw.write("$from $to")
        bw.newLine()
    } else {
        hanoi(n - 1, from, tmp, to)
        bw.write("$from $to")
        bw.newLine()
        hanoi(n - 1, tmp, to, from)
    }
}