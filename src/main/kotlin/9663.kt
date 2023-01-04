import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = br.readLine().toInt()
    val array = Array(15){0}
    var sum = 0

    fun check(value: Int) : Boolean {
        for(i in 0 until value)
            if(array[i] == array[value] || abs(array[value] - array[i]) == value - i) return false
        return true
    }

    fun dfs(x:Int){
        if(x == input)
            sum++
        else{
            for(i in 0 until input){
                array[x] = i
                if(check(x))
                    dfs(x+1)
            }
        }
    }

    dfs(0)
    bw.write("$sum")
    br.close()
    bw.flush()
    bw.close()
}