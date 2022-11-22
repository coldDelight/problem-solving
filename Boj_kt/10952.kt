import java.util.*

fun main() = with(Scanner(System.`in`)) {
    while (true) {
        val num1 = nextInt()
        val num2 = nextInt()
        if (num1 == 0 && num2 == 0){
            break
        }
        println(num1 + num2)
    }
}