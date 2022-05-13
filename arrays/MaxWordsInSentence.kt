package arrays

fun mostWordsFound(sentences: Array<String>): Int {

    val array : ArrayList<Int> = ArrayList()
    var max = 0
    sentences.forEach {
        val arr = it.split(" ")
        array.add(arr.size)
    }
    array.forEach{ number -> if(number > max){
        max = number
    } }
    return max
}
fun main(){
    println(countLength("My name is Sushant Neupane"))
}
fun countLength(s : String) : Int{
    val arr = s.split(" ")
    return arr.size
}