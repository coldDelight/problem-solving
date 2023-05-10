fun main() {
    val (a, b, c, d) = readln().split(" ")
    val num1 = "$a$b".toLong()
    val num2 = "$c$d".toLong()
    print(num1 + num2)
}