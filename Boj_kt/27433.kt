fun main() {
    val bw = System.out.bufferedWriter()
    val num = readln().toInt()
    bw.write("${factorial(num)}")
    bw.flush()
    bw.close()
}

fun factorial(n: Int): Long {
    return if (n <= 1) 1
    else factorial(n - 1) * n
}