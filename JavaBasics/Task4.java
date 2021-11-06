import java.util.Arrays;

public class Task4 {
    public static int countNumberOfPairs(int[] array, int target_number, boolean isStream){
        var counter = 0;
        if(isStream){
            counter = ((int)Arrays.stream(array).flatMap(i -> Arrays.stream(array)
                      .map(j -> i + j)).filter(i -> i == target_number).count()- (int)Arrays.stream(array).map(i -> 2*i)
                      .filter(i -> i == target_number).count())/2;
        } 
        else{
            for(int i = 0; i < array.length-1; i++){
                for(int j = i+1; j < array.length; j++){
                    if(array[i]+array[j] == target_number){
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
    public static void main(String[] args){
        int[] array = {1, 3, 6, 2, 2, 0, 4, 5};
        System.out.println("Result (for loop): " + countNumberOfPairs(array, 5, false));
        System.out.println("Result (stream): " + countNumberOfPairs(array, 5, true));
    }
}
