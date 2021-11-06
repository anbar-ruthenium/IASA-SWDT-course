import java.util.Arrays;

public class Task5 {
    public static String sortedOrder(String string) {
        string = string.toUpperCase();
        var names = string.split(";");
        return Arrays.stream(names)
                     .map(str -> str.substring(str.indexOf(":")+1) + ", " + str.substring(0, str.indexOf(":")))
                     .sorted().reduce("", (i, j) -> i + "(" + j + ")");
    }
    public static void main(String[] args){
        String s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
        System.out.println("Result: " + sortedOrder(s));
    }
}
