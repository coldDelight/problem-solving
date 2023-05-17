fun main() {
    val n = readln().toInt()
    repeat(n){
        val str = readln()

        print(str.first().uppercaseChar())
        println(str.drop(1))
    }
}