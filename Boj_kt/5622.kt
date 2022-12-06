fun main() {
    val str = readLine()!!
    var sum =0
    repeat(str.length){
        when(str[it].code){
            in 65..67-> sum+=3
            in 68..70-> sum+=4
            in 71..73-> sum+=5
            in 74..76-> sum+=6
            in 77..79-> sum+=7
            in 80..83-> sum+=8
            in 84..86-> sum+=9
            in 87..90-> sum+=10
        }
    }
    print(sum)
}