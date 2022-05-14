package LeetCodeProblems.src.arrays

import java.util.*

fun main(){
    print(Arrays.toString(createTargetArray(intArrayOf(0,1,2,3,4), intArrayOf(0,1,2,2,1))))
}
fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
    var array = IntArray(0)
    for(i in nums.indices){
        array = addAtIndex(index[i], nums[i], array)
    }
    return array
}

fun addAtIndex(index : Int, element : Int, array : IntArray) : IntArray{
    val tempArr = IntArray(array.size + 1)
    for(i in array.indices){
        tempArr.set(i, array[i])
    }
    for(i in tempArr.size - 1 downTo index + 1){
        tempArr.set(i, array[i - 1])
    }
    tempArr.set(index, element)
    tempArr.set(tempArr.size - 1, array.get(array.size - 1))
    return tempArr
}