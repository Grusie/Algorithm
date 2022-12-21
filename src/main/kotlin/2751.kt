import java.util.Scanner


fun main() {
    val sc = Scanner(System.`in`)
    val sb = StringBuffer()
    val list = ArrayList<Int>()

    for(i in 0 until sc.nextLine().toInt()){
        list.add(sc.nextLine().toInt())
    }
    list.sort()
    for(i in list)
        sb.append("$i\n")

    print(sb)
}