import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st : StringTokenizer
    var min = 0
    val order = br.readLine().toInt()

    val stackA = Stack<Int>()
    val stackB = Stack<Int>()

    for(j in 0..1) {
        st = StringTokenizer(br.readLine())
        for (i in 0 until order) {
            if(j == 0)
                stackA.push(st.nextToken().toInt())
            else
                stackB.push(st.nextToken().toInt())
        }
    }

    stackA.sort()

    for(i in 0 until stackA.size) {
        min += stackA.pop() * stackB.minOrNull()!!
        stackB.remove(stackB.minOrNull()!!)
    }

    bw.write("$min")
    br.close()
    bw.flush()
    bw.close()
}