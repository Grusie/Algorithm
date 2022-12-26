import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val hashSet = HashSet<Int>()
    val order = br.readLine()
    val st = StringTokenizer(br.readLine())

    for(i in 0 until order.toInt()){
        hashSet.add(st.nextToken().toInt())
    }

    val result = hashSet.sorted()

    for(i in result)
        bw.write("$i ")
    br.close()
    bw.flush()
    bw.close()
}