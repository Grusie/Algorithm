import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val array = ArrayList<Pair<Int, Int>>()

    for(i in 0 until br.readLine().toInt()){
        var list = br.readLine().split(" ").map { it.toInt() }
        array.add(Pair(list[0],list[1]))
    }
    val result = array.sortedWith(compareBy({it.first}, {it.second}))

    for (i in result) {
        bw.write("${i.first} ${i.second}\n")
    }
    br.close()
    bw.flush()
    bw.close()
}