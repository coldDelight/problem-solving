fun main() {
    val n = readln()
    val cnt = HashMap<Char, Int>()

    for (i in n) {
        val tmp = cnt[i] ?: 0
        if (i == '6' || i == '9') {
            val six = cnt['6'] ?: 0
            val nine = cnt['9'] ?: 0
            if (six < nine) {
                cnt['6'] = six + 1
            } else if (nine < six) {
                cnt['9'] = nine + 1
            } else {
                cnt[i] = tmp + 1
            }
        } else {
            cnt[i] = tmp + 1
        }
    }
    print(cnt.values.maxOrNull())
}