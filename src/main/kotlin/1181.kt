import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val hashSet = hashSetOf<String>()
    var input : String

    for (i in 0 until br.readLine().toInt()){
        input = br.readLine()
        hashSet.add(input)
    }

    val result = hashSet.sortedWith(compareBy({it.length}, {it}))
    for(i in result) {
        bw.write("$i\n")
    }
    br.close()
    bw.flush()
    bw.close()
}