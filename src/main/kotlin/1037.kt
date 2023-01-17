import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Collections
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val order = br.readLine()
    val arrayList = ArrayList<Int>()
    val st = StringTokenizer(br.readLine())

    for(i in 0 until order.toInt())
        arrayList.add(st.nextToken().toInt())

    bw.write("${Collections.min(arrayList) * Collections.max(arrayList)}")
    br.close()
    bw.flush()
    bw.close()
}