package sheriyans_qs;
import java.util.Scanner;

public class a25_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char n = sc.next().toLowerCase().charAt(0); 
        /* if (Character.getNumericValue(n)<10) {
            System.out.println("Not a letter");
        }else{
            switch (Character.getNumericValue(n)){
                case 10,14,18,24,30 -> System.out.println("Vowel");
                default  -> System.out.println("Consonant");
            }
        } */
        
        //method 2 simpler
        String result = "";
        result = switch (n){
            case 'a','e','i','o','u' -> "Vowel";
            default  -> Character.isLetter(n)? "Consonant":"Not a letter";

        };//as it's a statement
        System.out.println(result);
        
        
    }
}
