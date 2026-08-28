package Arrays;

import java.util.Arrays;

public class a11_0toLast_sameArr {
    public static void main(String[] args) {

        // given only o and 1 array 
        //move 0s to last without creating a new array
        int arr[] = {1 ,0 ,1 ,0 ,1 ,0};

        for (int s = 0,e = arr.length-1; s < arr.length; ) {
            //setting start and end indexes, where s and e will move conditionally
            if (s>=e) {
                break; //means all have been swaped
            }
            if (arr[s]==0 && arr[e]==1) { //swapping 0 and 1
                arr[s]=1;
                arr[e]=0;

            }if (arr[e]==0) e--; //change when elemnt from right/last become 0
            if (arr[s]==1) s++; //change when elemnt from left/first become 1

            
        }System.out.println(Arrays.toString(arr));

    }
}
