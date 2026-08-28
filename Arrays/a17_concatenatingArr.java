package Arrays;

import java.util.Arrays;

public class a17_concatenatingArr {
    public static void main(String[] args) {
        //making a new arr with size 2n
        //in the new array the elemnts to should repeat after n-1 index
        //eg: 1 2 3 -> 1 2 3 1 2 3
        int arr [] = {1,2,-1,3} ;
        int n = arr.length;
        int arr2[] = new int[2*n] ;
        
        for (int i = 0; i < 2*n; i++) {
            if (i<n) {
                arr2[i] = arr[i];
            } else {
                arr2[i] = arr[i-n];
            }
        }System.out.println(Arrays.toString(arr2));

    }
}
