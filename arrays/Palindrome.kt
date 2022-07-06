package arrays

class Palindrome {
    fun isPalindrome(x: Int): Boolean {

        try{
            var temp = ""
            for(i in countTotalDigit(x) - 1 downTo 0){
                temp += x.toString().get(i).toString()
            }
            return temp.toInt() == x
        }catch (e : java.lang.Exception){
            return false
        }
    }

    fun countTotalDigit(x : Int) : Int = x.toString().length
}

fun main(){
    val pal = Palindrome()
    println(pal.isPalindrome(122))
    print(pal.countTotalDigit(123))
}