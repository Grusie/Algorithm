fun main() {
    readLine()
    val arrayN = readLine()!!.split(" ").map { it.toInt() }.sorted()
    readLine()
    val arrayM = readLine()!!.split(" ").map {it.toInt()}

    for(i in arrayM){
        if(arrayN.binarySearch(i)>=0) println(1)
        else println(0)
    }
}