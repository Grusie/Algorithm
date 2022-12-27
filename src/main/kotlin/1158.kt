import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(br.readLine())
    val array = ArrayList<Int>()

    for (i in 1.. st.nextToken().toInt()) {
        array.add(i)
    }

    var index = 0
    val loop = st.nextToken().toInt()
    val result = ArrayList<Int>()

    while (array.isNotEmpty()) {
        index = (index + loop - 1)% array.size

        result.add(array[index])
        array.removeAt(index)
    }
    bw.write("<")
    bw.write(result.joinToString(", "))
    bw.write(">")

    br.close()
    bw.flush()
    bw.close()

}