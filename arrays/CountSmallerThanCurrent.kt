package LeetCodeProblems.src.arrays

/*Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.*/

fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val array = IntArray(nums.size)
    var count = 0;
    for (i in 0 until nums.size){
        for ( j in 0 until nums.size){
            if(nums[i] > nums [j] && j!=i){
                count++
            }
        }
        array[i] = count
        count = 0
    }
    return array
}