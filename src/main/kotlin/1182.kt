import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var st = StringTokenizer(br.readLine())

    var order = st.nextToken().toInt()
    var sum = st.nextToken().toInt()
    val array = Array(order){0}
    var count = 0

    st = StringTokenizer(br.readLine())
    for(i in 0 until order){
        array[i] = st.nextToken().toInt()
    }

    fun dfs(start: Int,  temp : Int){
        if(start == array.size) {
            if (temp == sum)
                count++
            return
        }
        dfs(start+1, temp)
        dfs(start+1, temp + array[start] )
    }

    dfs(0, 0)
    if (sum == 0)
        count--
    bw.write("$count")
    br.close()
    bw.flush()
    bw.close()
}