fun main() {
    val br = System.`in`.bufferedReader()
    val sb = StringBuffer()
    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val numbers = IntArray(n + 1) { it }

    repeat(m) {
        val cmd = br.readLine().split(" ").map { it.toInt() }
        if (cmd[0] == 0) {
            val num1 = find(numbers, cmd[1])
            val num2 = find(numbers, cmd[2])
            if (num1 != num2) {
                numbers[num2] = num1
            }
        } else if (cmd[0] == 1) {
            val num1 = find(numbers, cmd[1])
            val num2 = find(numbers, cmd[2])
            if (num1 == num2) {
                sb.append("YES\n")
            }else{
                sb.append("NO\n")
            }
        }
    }
    br.close()
    print(sb.toString())
}

private fun find(numbers: IntArray, x: Int): Int {
    if (numbers[x] == x) return x
    numbers[x] = find(numbers, numbers[x])
    return numbers[x]
}