package arrays

fun main(){

}
fun runningSum(nums: IntArray): IntArray {
    val array = IntArray(nums.size)
    var sum = 0
    for (i in 0 until nums.size){
        sum += nums.get(i)
        array.set(i, sum)
    }
    return array
}