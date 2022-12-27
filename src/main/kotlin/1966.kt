import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val order = br.readLine().toInt()
    var st : StringTokenizer

    for(i in 0 until order){
        val queue : Queue<Int> = LinkedList()
        st = StringTokenizer(br.readLine())
        var size = st.nextToken().toInt()
        var index = st.nextToken().toInt()
        st = StringTokenizer(br.readLine())
        for(j in 0 until size) {
            queue.offer(st.nextToken().toInt())
        }
        var count = 0
        while(index != 0 && queue.peek() != queue.maxOrNull()){
            queue.add(queue.poll())
            index--
            if(index<0)
                index = queue.size-1
            count++
        }
        bw.write("$count\n")

    }
    br.close()
    bw.flush()
    bw.close()
}