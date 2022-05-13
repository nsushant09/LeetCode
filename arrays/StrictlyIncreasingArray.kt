package arrays

import java.util.*

fun canBeIncreasing(nums: IntArray): Boolean {
    val array = nums.toMutableList()
    print(array.size)
    if(isStrictlyIncreasing(array)){
        return true
    }
    for(i in 0 until nums.size - 1)
    {
        if(nums[i] >= nums[i + 1]){
            array.removeAt(i)
        }
    }
    return isStrictlyIncreasing(array)
}

fun isStrictlyIncreasing(nums : MutableList<Int>) : Boolean {
    if(nums.size == 1){
        return true
    }
    for(i in 0 until nums.size - 1){
        if(nums[i] >= nums[i + 1]){
            return false
        }
    }
    return true
}

fun main(){
    val flag = canBeIncreasing(intArrayOf(1,1,1))

    print(flag)
}
