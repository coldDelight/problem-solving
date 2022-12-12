fun main() {
    val num = readLine()!!.split(" ").map { it.toInt() }
    var tmp = 0
    var cntIn = 0
    var cntDe = 0

    for (i in num) {
        if (tmp + 1 == i) {
            cntIn++
        }
        tmp = i
    }
    tmp = 9
    for (i in num) {
        if (tmp - i == 1) {
            cntDe++
        }
        tmp = i
    }
    if (cntIn == 8) {
        print("ascending")
    } else if (cntDe == 8) {
        print("descending")
    } else {
        print("mixed")
    }
}