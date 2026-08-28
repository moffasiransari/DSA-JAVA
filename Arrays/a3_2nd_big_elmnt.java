package Arrays;

import java.util.Scanner;

public class a3_2nd_big_elmnt {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array ");
        int arr[] = new int[sc.nextInt()] ;
         //taking elements input
         System.out.println("enter elements separated by one space or enter");
         for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
         }
        /* int max =arr[0];
        int indexMax=0;
        int scndMax ;
        for (int i =1;i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
                indexMax=i;
            }
        }scndMax = arr[(indexMax!=0)? indexMax-1:indexMax+1]; //making sure scndmax !=max;
        for (int i =1;i<arr.length;i++){
            if (arr[i]>scndMax && arr[i]!=max) {
                scndMax=arr[i];
            }
        }
        System.out.println("Second greatest element = " +scndMax); */

        //MORE COMPACT method
        int max = Integer.MIN_VALUE;
        int scndMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){ 
                scndMax=max;
                max=arr[i];
            }else if (arr[i]>scndMax){
                scndMax=arr[i];
            }
        }
    }
}
