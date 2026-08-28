package sheriyans_qs;

import java.util.Scanner;

public class a1_vowel {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        char a = 'g';
        String outpt=" " ;
        String lowerString = String.valueOf(a).toLowerCase();
        System.out.println(lowerString);
     
        /* checking if the a is no.
        if (String.valueOf(Character.getNumericValue(a)).equals(lowerString)) {
            outpt = "Invalid input"; */
        
        //making sure that input char is a alphabet 
        //since we already converted them to small letter we just have to check for the value of small letter
        if (Character.getNumericValue(lowerString.charAt(0))<10 ){
            //means it's not a letter
            System.out.println("Invalid input");
        
        }else{
            switch (String.valueOf(lowerString).toLowerCase()) {
                case "a" -> outpt = "Vowel"; 
                case "e" -> outpt = "Vowel"; 
                case "i" -> outpt = "Vowel"; 
                case "o" -> outpt = "Vowel"; 
                case "u" -> outpt = "Vowel"; 
                default -> outpt = "Consonant";
            }System.out.println(outpt);
        }
            
    }
}
