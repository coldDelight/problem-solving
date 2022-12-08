fun main() {
    var str = readLine()!!
    val target = arrayListOf<String>("c=","c-","dz=","d-","lj","nj","s=","z=")
    for (check in target){
        str = str.replace(check,"A")
    }
    print(str.length)
}
