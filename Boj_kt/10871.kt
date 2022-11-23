fun main() {
    val nx = readLine()!!.split(" ").map { it.toInt() }
    val number = readLine()!!.split(" ").map { it.toInt() }
    repeat(nx[0]){
        if(nx[1]>number[it]){
            print("${number[it]} ")
        }
    }
}
