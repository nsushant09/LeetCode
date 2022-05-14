package LeetCodeProblems.src.arrays

fun maxArea(height: IntArray): Int {
    var max = Int.MIN_VALUE
    for(i in 0 until height.size - 1){
        for(j in height.indices){
            if(height[i] * height[j] > max){
                max = height[i] * height[j]
            }
        }
    }
    return max
}
