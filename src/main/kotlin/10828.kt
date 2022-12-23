import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack
import java.util.StringTokenizer

fun main() {
    val stack = Stack<Int>()
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st : StringTokenizer

    for(i in 0 until br.readLine().toInt()){
        st = StringTokenizer(br.readLine(), " ")
        try {
            when (st.nextToken()) {
                "top" -> bw.write("${stack.peek()}\n")
                "size" -> bw.write("${stack.size}\n")
                "empty" -> bw.write(if (stack.isEmpty()) "1\n" else "0\n")
                "pop" -> bw.write("${stack.pop()}\n")
                else -> stack.push(st.nextToken().toInt())
            }
        }catch (e:java.lang.Exception){
            bw.write("-1\n")
        }
    }
    br.close()
    bw.flush()
    bw.close()
}