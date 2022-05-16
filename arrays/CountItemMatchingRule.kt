package LeetCodeProblems.src.arrays

fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {

    var currentItemList : List<String>
    var count : Int = 0

    items.forEach{
        currentItemList = it
        if(ruleKey.equals("type", true)){
            if(ruleValue.equals(it.get(0))){
                count++
            }
        }else if(ruleKey.equals("color", true)){
            if(ruleValue.equals(it.get(1))){
                count++
            }
        }else{
            if(ruleValue.equals(it.get(2))){
                count++
            }
        }
    }

    return count
}