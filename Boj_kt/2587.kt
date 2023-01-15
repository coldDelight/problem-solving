fun main() {
    val size = 5
    val arr = IntArray(size){0}
    repeat(size){
        arr[it] = readln().toInt()
    }
    println(arr.sum()/5)
    println(arr.sorted()[size/2])
}
