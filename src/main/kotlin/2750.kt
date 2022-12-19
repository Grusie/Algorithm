fun main() {
    val input = readLine()!!.toInt()
    val array = Array(input){0}
    for(i in 0 until input)
        array[i] = readLine()!!.toInt()

    //bubbleSort(array)
    //selectSort(array)
    insertionSort(array)
}

fun insertionSort(array: Array<Int>) {

    for(j in 1 until array.size){
        var key = array[j]
        var tempMax = j-1
        while(tempMax >= 0 && array[tempMax] > key){
            array[tempMax+1] = array[tempMax]
            tempMax--
        }
        array[tempMax+1] = key
    }

    for(i in array) println(i)
}

fun bubbleSort(array: Array<Int>){
    var temp:Int
    for(j in array.indices) {
        for (i in 0 until (array.size - 1)) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1]
                array[i + 1] = array[i]
                array[i] = temp
            }
        }
    }

    for(i in array)
        println(i)
}

fun selectSort(array: Array<Int>){
    var min : Int
    var temp : Int

    for(j in array.indices) {
        min = j
        for (i in j+1  until array.size) {
            if(array[min] > array[i])
                min = i
        }
        if(j != min) {
            temp = array[j]
            array[j] = array[min]
            array[min] = temp
        }
    }
    for(i in array)
        println(i)
}