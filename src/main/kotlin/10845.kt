import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val queue: Queue<Int> = LinkedList()
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st : StringTokenizer

    for(i in 0 until br.readLine().toInt()){
        st = StringTokenizer(br.readLine())
        try {
            when (st.nextToken()) {
                "front" -> bw.write("${queue.first()}\n")
                "size" -> bw.write("${queue.size}\n")
                "empty" -> bw.write(if (queue.isEmpty()) "1\n" else "0\n")
                "pop" -> bw.write("${queue.remove()}\n")
                "back" -> bw.write("${queue.last()}\n")
                else -> queue.add(st.nextToken().toInt())
            }
        }catch (e:java.lang.Exception){
            bw.write("-1\n")
        }
    }
    br.close()
    bw.flush()
    bw.close()
}