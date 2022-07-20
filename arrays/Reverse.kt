package arrays

import java.lang.reflect.Type
import java.util.*

fun main(){
    var array : Array<Int> = arrayOf(1, 2, 3, 4, 5, 10, 20, 30 , 40, 50)
//    for(i in 0 until array.size - 1){
//        for(j in i until array.size){
//            val temp = array[i]
//            array[i] = array[j]
//            array[j] = temp
//        }
//    }
    array = reverseArray(array)
    println(Arrays.toString(array))
}

fun <T> reverseArray(array: Array<T>): Array<T> {
    for (i in 0 until array.size - 1) {
        for (j in i until array.size) {
            val temp = array[i]
            array[i] = array[j]
            array[j] = temp
        }
    }
    return array
}