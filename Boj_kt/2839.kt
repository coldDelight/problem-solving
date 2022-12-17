fun main() {
    var n = readln().toInt()
    var res = 0
    var check = true

    while(n>=0){
        if(n%5==0){
            res+= n/5
            print(res)
            check=false
            break
        }
        n-=3
        res+=1
    }
    if(check){
        print(-1)
    }
}