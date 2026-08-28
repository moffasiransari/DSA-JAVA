package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class a12_0toLast_newArr {
    public static void main(String[] args) {
        // given only o and 1 array 
        //move 0s to last by creating a new array.
        //have to print the new array elem sep with spaces
        //have to take input for the array
        
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); 
        }
        // int arr [] = {1,0,1,0,1,0,1,1,1,1,1} ;
        //M1 creating a new array then printing using for
        int arr2[] = new int[arr.length];
        for (int i = 0, e = arr.length - 1, s = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr2[e] = arr[i];
                e--;
            } else {
                arr2[s] = arr[i];
                s++;
            }
        }System.out.println(Arrays.toString(arr2));
        
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        
    }
    
    
}
