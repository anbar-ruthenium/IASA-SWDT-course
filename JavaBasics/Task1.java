import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Task1 {
    public static ArrayList<Integer> getIntegersFromList(List<Object> list){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(Object element: list){
            if(element instanceof Integer){
                result.add((Integer) element);
            }
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(getIntegersFromList(Arrays.asList(1,2,'a','b')));
        System.out.println(getIntegersFromList(Arrays.asList(1,2,'a','b',0,15)));
        System.out.println(getIntegersFromList(Arrays.asList(1,2,'a','b',"aasf",'1',"123",231)));
    }
}
