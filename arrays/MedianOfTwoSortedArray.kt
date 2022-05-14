package LeetCodeProblems.src.arrays

import java.util.*
import kotlin.collections.ArrayList

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    var arr = DoubleArray(nums1.size + nums2.size)
    var i = 0
    nums1.forEach {
        arr.set(i, it.toDouble())
        i++
    }
    nums2.forEach {
        arr.set(i, it.toDouble())
        i++
    }
    arr = arr.sortedArray()
    if(arr.size % 2 != 0){
        return arr[arr.size / 2].toDouble()
    }else{
        return ((arr[arr.size / 2] + arr[arr.size / 2 -1]) / 2).toDouble()
    }
}
fun main(){
    println(findMedianSortedArrays(intArrayOf(1,2), intArrayOf(3,4)))
}