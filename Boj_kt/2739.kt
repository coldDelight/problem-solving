fun main() {
    val n = readLine()!!.toInt()
    repeat(9){
        println("$n * ${it+1} = ${n*(it+1)}")
    }
}