fun main() {
    val str = readLine()!!.split(" ")

    if(str[0]==""&&str[str.size-1]==""){
        print(str.size-2)
    }else if(str[0]==""||str[str.size-1]==""){
        print(str.size-1)
    }else{
        print(str.size)
    }
}

