package arrays

/*
* There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.
* */

fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
    val array = BooleanArray(candies.size)
    var highest = Int.MIN_VALUE
    candies.forEach { highest = Math.max(it, highest) }
    for(i in 0 until candies.size){
        if((candies[i] + extraCandies) >= highest){
            array[i] = true
        }else{
            array[i] = false
        }
    }

    return array
}
