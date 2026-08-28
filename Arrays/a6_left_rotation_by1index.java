package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class a6_left_rotation_by1index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr.length - 1)
                arr2[arr.length - 1] = arr[0];
            else
                arr2[i] = arr[i + 1];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
