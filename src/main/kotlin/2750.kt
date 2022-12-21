fun main() {
    val input = readLine()!!.toInt()
    val array = Array(input){0}
    for(i in 0 until input)
        array[i] = readLine()!!.toInt()

    array.sort()
    for(i in array)
        println(i)
    //bubbleSort(array)
    //selectSort(array)
    //insertionSort(array)
    //mergeSort(array)
    /*val list = quickSort(array.toList())
    for(i in list)
        println(i)*/
}

fun quickSort(list: List<Int>): List<Int> {
    if (list.size < 2) {
        return list
    }

    val pivot = list[list.size / 2]
    val left = list.filter { it < pivot }
    val right = list.filter { it > pivot }

    return quickSort(left) + listOf(pivot) + quickSort(right)
}


private fun mergeSort(array: Array<Int>) {
    val temp = Array(array.size){0}

    mergeSort(array, temp, 0, array.size -1)
    for(i in array)
        println(i)
    }

private fun mergeSort(array: Array<Int>, temp: Array<Int>, start: Int, end: Int){
    if(start < end){
        val half = (start+end)/2
        mergeSort(array, temp, start, half)
        mergeSort(array, temp, half+1, end)
        merge(array, temp, start, half, end)
    }
}

private fun merge(array: Array<Int>, temp: Array<Int>, start: Int, half: Int, end: Int) {
    for(i in start..end)
        temp[i] = array[i]
    var part1 = start
    var part2 = half + 1
    var index = start

    while(part1 <= half && part2 <= end){
        if(temp[part1] <= temp[part2]){
            array[index] = temp[part1]
            part1++
        }else {
            array[index] = temp[part2]
            part2++
        }
        index++
    }
    for(i in 0 .. half-part1){
        array[index + i] = temp[part1 +i]
    }
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