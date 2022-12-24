fun main() {
    var num = readln()
    var res:String
    while(num!="0"){
        res = "yes"
        for(i in num.indices){
            if(num[i]!=num[num.length-i-1]){
                res = "no"
                break
            }
        }
        println(res)
        num = readln()
    }
}