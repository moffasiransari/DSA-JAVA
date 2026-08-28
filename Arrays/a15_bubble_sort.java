package Arrays;

public class a15_bubble_sort {
    public static void main(String[] args) {
        //sorting useing bubble sort algorithm
        int arr [] = {1,5,4,7,2,8,3,9} ;
        int n = arr.length;
        int noSwapCount = 0;
        for (int i = 0; i < n; i++) {
            noSwapCount = 0;
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    //swapping the no.
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] =temp; 
                }else noSwapCount++;                
            }
            if (noSwapCount==n-1) break;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}
