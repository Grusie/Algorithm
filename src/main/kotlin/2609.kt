import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(br.readLine())

    val num1 = st.nextToken().toInt()
    val num2 = st.nextToken().toInt()

    val max = gcd(num1,num2)

    bw.write("$max\n")
    bw.write("${num1*num2/max}")

    br.close()
    bw.flush()
    bw.close()
}
fun gcd(a: Int, b: Int):Int{
    var a1 = a
    var b1 = b
    while(b1 != 0) {
        var r = a1 % b1
        a1 = b1
        b1 = r
    }
    return a1
}