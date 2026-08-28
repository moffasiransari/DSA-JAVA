package Arrays;

import java.util.Scanner;

public class a1_max_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()] ;
         //taking elements input
         System.out.println("enter elements separated by one space or enter");
         for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
         }
        int max =arr[0]; //now the loop will work even if the all no. are negative
        int index = 0;
        for (int i =1;i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
                index = i;
            }
        }System.out.println("Max element =" +max+ " found at index "+index);
    }
}
