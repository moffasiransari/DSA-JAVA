package Arrays;

import java.util.Scanner;

public class a7_left_rotn_byK_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        // roatation by k elements
        int k = sc.nextInt();
       
        // if k >arr.length
       
        /* while (k > arr.length) {
            k -= arr.length; // get effective rotation
        } */

        //No need to use while loop for effective rotation
        if (k>arr.length) {
            k = k%arr.length;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int j = -1;
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i <= arr.length - 1 - k) {
                arr2[i] = arr[i + k];
            } else {
                arr2[i] = arr[j + 1];
                j += 1;
            }
            System.out.print(arr2[i] + " ");
        }

    }
}
