import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayDeque

fun main() {
    val queue = ArrayDeque<Int>()
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
                "pop_front" -> bw.write("${queue.removeFirst()}\n")
                "pop_back" -> bw.write("${queue.removeLast()}\n")
                "back" -> bw.write("${queue.last()}\n")
                "push_front" -> queue.addFirst(st.nextToken().toInt())
                "push_back" -> queue.addLast(st.nextToken().toInt())
            }
        }catch (e:java.lang.Exception){
            bw.write("-1\n")
        }
    }
    br.close()
    bw.flush()
    bw.close()
}