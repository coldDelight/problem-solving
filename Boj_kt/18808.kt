data class Monun(
    var r: Int,
    var c: Int,
    var sticker: Array<BooleanArray>,
)

fun main() {
    val (n, m, k) = readln().split(" ").map { it.toInt() }
    val laptop = Array(n) { BooleanArray(m) { false } }

    fun canAttach(r: Int, c: Int, monun: Monun): Boolean {
        for (i in 0 until monun.r) {
            for (j in 0 until monun.c) {
                if (laptop[i + r][j + c] && monun.sticker[i][j]) {
                    return false
                }
            }
        }
        return true
    }

    fun attachSticker(r: Int, c: Int, monun: Monun) {
        for (i in 0 until monun.r) {
            for (j in 0 until monun.c) {
                if (monun.sticker[i][j]) {
                    laptop[i + r][j + c] = true
                }
            }
        }
    }

    fun attachOrFalse(monun: Monun): Boolean {
        for (i in 0..n - monun.r) {
            for (j in 0..m - monun.c) {
                if (canAttach(i, j, monun)) {
                    attachSticker(i, j, monun)
                    return true
                }
            }
        }
        return false
    }

    fun rotate(monun: Monun) {
        val tempSticker = Array(monun.c) { BooleanArray(monun.r) }
        for (i in 0 until monun.r) {
            for (j in 0 until monun.c) {
                tempSticker[j][monun.r - 1 - i] = monun.sticker[i][j]
            }
        }

        val tmp = monun.r
        monun.r = monun.c
        monun.c = tmp
        monun.sticker = tempSticker
    }

    repeat(k) {
        val (r, c) = readln().split(" ").map { it.toInt() }
        val sticker = Array(r) { readln().split(" ").map { it == "1" }.toBooleanArray() }
        val monun = Monun(r, c, sticker)

        for (i in 0 until 4) {
            val isAttached = attachOrFalse(monun)
            if (isAttached) {
                break
            } else {
                rotate(monun)
            }
        }
    }
    println(laptop.sumOf { it.filter { it }.size })
}
