import java.util.Scanner;

public class Task3 {
    public static int digitalRoot(int n){
        var root = 10;
        while (root >= 10){
            root = 0;
            while(n != 0) {
                root += n % 10;
                n /= 10;
            }
            n = root;
        }
        return root;
    }
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Digital Root\n");
            System.out.println("Enter number:");
            int number = scanner.nextInt();
            System.out.println("Result: " + digitalRoot(number));
        }        
    }
}
