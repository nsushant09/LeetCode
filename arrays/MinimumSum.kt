package arrays


fun main(){
    val list = mutableListOf<Int>(3,2, 10, 20, 30)

    for(i in 0 until list.size -1){
        for (j in i until list.size){
            if(list[j] > list[i]){
                val temp = list[i]
                list[i] = list[j]
                list[j] = temp
            }
        }
    }

    print(list.toString())

//    //map : Key - Value pair
//    val stringList : List<String> = listOf("Sushant", "Yogesh", "Utsab", "Pratyush", "Subhashree", "Jenny", "Aayush", "Binod", "Shanvi")
//    val intList : List<Int> = listOf(10, 12, 3, 5, 9, 1, 2, 98)
//    var myHashMap = HashMap<String, Int>()
//
//    for(i in 0 until stringList.size){
//        try{
//            myHashMap.put(stringList.get(i), intList.get(i))
//        }catch(e : Exception){
//        }
//    }
//    print(myHashMap.toString())

}