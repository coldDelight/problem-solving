fun main() {
    val n = readln().toInt()
    val set = mutableSetOf<Int>()
    readln().split(" ").map{set.add(it.toInt()) }

    val m = readln().toInt()
    readln().split(" ").map {
        if (set.contains(it.toInt())) {
            print("1 ")
        } else {
            print("0 ")
        }
    }
}