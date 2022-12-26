import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var order = br.readLine()
    var st = StringTokenizer(br.readLine())
    val array = Array(20000001){0}

    for(i in 0 until order.toInt()){
        array[st.nextToken().toInt() + 10000000] += 1
    }

    order = br.readLine()
    st = StringTokenizer(br.readLine())

    for(i in 0 until order.toInt()){
        var item = st.nextToken().toInt()
        bw.write("${array[item+10000000]} ")
    }

    br.close()
    bw.flush()
    bw.close()
}