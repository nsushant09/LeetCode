package linearSearch;

public class one {
    public static void main(String[] args) {
        //find weather 14 is in the array or not
        int [] array = {18,12, 9, 14, 77, 50};
        if(doesElementExist(array, 2)){
            System.out.println("Yes the number exists ");
        }else{
            System.out.println("No the number does not exists");
        }
    }
    static boolean doesElementExist(int [] array, int target){
        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                return true;
            }
        }
        return false;
    }
}
