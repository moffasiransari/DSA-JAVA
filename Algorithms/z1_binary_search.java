package Algorithms;


import java.util.Scanner;

public class z1_binary_search {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // taking numsay elements
        int arr[] = { 10, 20, 22, 25, 35, 39, 47, 56, 59, 65, 62, 78, 199 };
        int target = 79;
        int s = 0,e = arr.length-1,m=0,ans=-1,numSteps=0;
        // if target not in the list then ans = -1

        for(
        int i = 0;i<arr.length;i++)
        {
            if (s >= e) {
                break;
            }
            m = (s + e) / 2;
            numSteps++;
            if (arr[m] == target) {
                ans = m;
                break;
            } else if (arr[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }System.out.println(ans+"  "+numSteps);
    }
}
