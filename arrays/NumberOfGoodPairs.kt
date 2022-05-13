package arrays

/*
* Given an array of integers nums, return the number of good pairs.
* A pair (i, j) is called good if nums[i] == nums[j] and i < j.
* */

fun numIdenticalPairs(nums: IntArray): Int {
    var count = 0
    for(i in 0 until nums.size -1 ){
        for(j in i + 1 until nums.size){
            if (nums[i] == nums[j]){
                count++
            }
        }
    }
    return count
}