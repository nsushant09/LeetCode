package arrays

import java.util.*

fun shuffle(nums: IntArray, n: Int): IntArray {
    val array = IntArray(nums.size)
    var step = 0
    for (i in 0 until nums.size / 2){
        array[i + step] = nums[i]
        array[i + step + 1] = nums[i + n]
        step++
    }

    return array
}
fun main(){
    print(Arrays.toString(shuffle(intArrayOf(2,5,1,3,4,7), 3)))
    for( i in 0 until 10 step 2){
        print(i)
        print(i + 1)
    }
}