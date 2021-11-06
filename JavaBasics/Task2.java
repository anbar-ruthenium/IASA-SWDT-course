public class Task2 {
    public static String first_non_repeating_letter(String string){
        var lowercase_letters = string.toLowerCase();
        for(int i = 0; i < lowercase_letters.length(); i++){
            if(lowercase_letters.indexOf(lowercase_letters.charAt(i), lowercase_letters.indexOf(lowercase_letters.charAt(i))+1) == -1)
                return String.valueOf(string.charAt(i));
        }
        return "";
    }
    public static void main(String[] args){
        System.out.println(first_non_repeating_letter("SsTtRrEe"));
        System.out.println(first_non_repeating_letter("stress"));
        System.out.println(first_non_repeating_letter("sTreSS"));
    }
}
