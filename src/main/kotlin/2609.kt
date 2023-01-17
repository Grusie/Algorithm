import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(br.readLine())

    val num1 = st.nextToken().toInt()
    val num2 = st.nextToken().toInt()

    val array = Array(10001){false}
    val publicArray = ArrayList<Int>()

    fun addArray(num : Int){
        for (i in 2.. num) {
            if (num % i == 0) {
                if(!array[i])
                    array[i] = true
                else
                    publicArray.add(i)
            }
        }
    }
    addArray(num1)
    addArray(num2)

    val min = Collections.max(publicArray)
    bw.write("$min\n")

    bw.write("${num1*num2/min}")
    br.close()
    bw.flush()
    bw.close()
}