package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class a5_arr_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int arrReverse[] = new int[arr.length];
        for (int index = 0; index < arr.length; index++) {
            arrReverse[index] = arr[arr.length - index - 1];
        }
        for (int i = 0; i < arrReverse.length; i++) {
            System.out.print(arrReverse[i]+" ");
        }
    }
}
