package Algorithms;

import java.util.Arrays;

public class z5_insertionsSort {
    public static void main(String[] args) {
        int arr [] = {5,1,3,4,2,8,5,6,0,9,7,10,15,13,12,14,};
        int steps = 0;

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int pi = i-1; //pi= prev index

            while (pi>=0 && arr[pi]>key) {
                steps++;
                arr[pi+1]=arr[pi];
                pi--;
            }
            arr[pi+1]=key;
        }System.out.println(Arrays.toString(arr)+"\n"+steps);
        
    }
}
