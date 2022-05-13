package arrays

fun finalValueAfterOperations(operations: Array<String>): Int {

    var x = 0
    operations.forEach {
        if(it == "++X" || it == "X++"){
            x++
        }else{
            x--
        }
    }
    return x
}