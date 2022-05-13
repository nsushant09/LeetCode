package arrays

import java.util.*

fun getConcatenation(nums: IntArray): IntArray {
    val array = arrayListOf<Int>()
    for(i in 0 until 2){

        nums.forEach { element -> array.add(element)}

    }
    return array.toIntArray()
}

fun main(){
    val array = getConcatenation(intArrayOf(0,1,2))
    print(Arrays.toString(array))
}
