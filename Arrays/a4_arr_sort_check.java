package Arrays;

import java.util.Scanner;

public class a4_arr_sort_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            //in comparing loops in arrays we never index on last index as i+1 = out of index 
            if (arr[i]>arr[i+1]) {
                isSorted = false;
                break;
            }
        } System.out.println((isSorted==true)?"Yes":"No");

    }
}
