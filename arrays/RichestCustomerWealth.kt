package arrays

fun maximumWealth(accounts: Array<IntArray>): Int {

    val array = ArrayList<Int>(accounts.size)
    var max = 0
    accounts.forEach { arrays -> array.add(arrays.sum())}
    array.forEach{ number -> if(number > max){
        max = number
    } }

    return max

}