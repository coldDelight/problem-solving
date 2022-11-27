fun main() {
    val number = readLine()!!.split(" ")
    val num1 = "${number[0][2]}${number[0][1]}${number[0][0]}"
    val num2 = "${number[1][2]}${number[1][1]}${number[1][0]}"
    if(num1<num2){
        print(num2)
    }else{
        print(num1)
    }
}