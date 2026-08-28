package Arrays;

import java.util.Arrays;

public class a10_max_sum_subArr {
    public static void main(String[] args) {
        int arr [] = {1000,-1000,2000,-1500,1500,100,-2000} ;
        /* 
         Have to only Print max sum of any continuous sub arrya
        */
        // sorting the array-> break the order ->no subarray
        int sum = arr[0];
        int maxSum= arr[0];
        int prevMaxSum = arr[0];
        int si = 0; // start index of that sub array
        int ei = 0; // end index of max sum of that elemnts loop
        int tempEi=0; //temp end index of that loop

        for (int i = 0; i < arr.length; i++) {
            sum = arr[i];
            maxSum= arr[i];
            for (int j = i+1; j < arr.length; j++) {
                sum+=arr[j];
                if (sum>maxSum) {
                    maxSum =sum;
                    tempEi=j;
                    System.out.println("sum "+sum+" si:"+si+" ei:"+ei);
                } 
            }if (maxSum>prevMaxSum){ 
                prevMaxSum = maxSum;
                si=i;
                ei=tempEi;

            }
        }System.out.println(prevMaxSum);
        
        // making the subarray
        int subArr[] = new int[ei-si+1] ;
        for (int i = si,j=0; i <=ei; i++,j++) {
            subArr[j]=arr[i];
        }System.out.println(Arrays.toString(subArr));
        
    }
}
