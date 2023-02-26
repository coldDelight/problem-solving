fun main() {
    val str = readln()
    var cnt =0
    var tmp = str[0]
    for(i in 0 until str.length-1){
        if(tmp!=str[i+1]){
            if(str[i+1]!=str[0]){
                cnt++
            }
            tmp = str[i+1]

        }
    }
    print(cnt)
}
//1. 전체0,1개수 파악 작은거를 돌려야겠다
//2. 11001100110011000001 에서는 1:9개  0:11개 1번 해결책 불가능 
//3. 0이든 1이든 바뀌는 순간의 카운트가 답 -> sol