package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class a8_right_byK_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        // roatation by k elements
        int k = sc.nextInt();
        // if k >arr.length
        if (k>arr.length) {
            k = k%arr.length;
        }//getting arr elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i-k > -1) {
                arr2[i] = arr[j];
                j++;
            } else arr2[i] = arr[arr.length-k+i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
