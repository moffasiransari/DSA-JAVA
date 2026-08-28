package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class a16_arr_reverse_sameArr {
    public static void main(String[] args) {
        //Reversing the elements of the array without making a new array
        /* Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }   */
        int arr [] = {1,2,3,4,5,6} ;
        int n = arr.length;
        for (int s = 0,e=n-1; s < e; s++,e--) {
            //swap s and e element
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

        }System.out.println(Arrays.toString(arr));
    }
}
