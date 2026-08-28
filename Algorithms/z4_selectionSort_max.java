package Algorithms;

import java.util.Arrays;

public class z4_selectionSort_max {
    public static void main(String[] args) {
        int arr [] = {5,1,3,4,2} ;
        int j = 0;
        int steps = 0;

        for (int i = arr.length-1; i >0 ; i--) {
            int max = i; //max index
            //we're moving from right to left and checking is any 
            // element is greater the max index element->yes ->swap
            for ( j = i-1; j >=0; j--) {
                steps++;
                if (arr[j]>arr[max]) {
                    max = j;
                }
            }
            if (max!=i) { //saves on step if arr(i) is already smallest 
                int temp = arr[max];
                arr[max] = arr[i];
                arr[i] = temp;
            }
        }System.out.println(Arrays.toString(arr)+"\n"+steps);
    }
}
