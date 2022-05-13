package arrays

fun restoreString(s: String, indices: IntArray): String {
    val arrayString = CharArray(indices.size)
    for(i in 0 until indices.size){

        arrayString[indices.get(i)] = s.get(i)

    }
    return String(arrayString)

}
fun main(){
    val string = restoreString("codeleet", intArrayOf(4,5,6,7,0,2,1,3))
    print(string)
}