fun main() {
    val (x,y,w,h) = readln().split(" ").map { it.toInt() }

    val numList = arrayListOf<Int>(x,y)
    numList.add(w-x)
    numList.add(h-y)

    print(numList.min())
}