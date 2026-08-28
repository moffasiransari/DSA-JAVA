package Arrays;

public class a14_trgt_indx_binary {
    public static void main(String[] args) {
        //using binary search -> neead sorted list->given
        int m = 12;  //taget element
        int arr [] = {1,2,3,4,5,6,7,8,9,10,11,12,13} ;
        int index = -1;
        int s = 0;
        int e = arr.length-1;
        int mid = 0;
        int steps = 0;

        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (s>=e) break;
            mid = s + (e-s)/2; //preventing type overflow
            if (m==arr[mid]){ 
               index = mid;
               break; 
            }else if (m>arr[mid]){
                s=mid+1;
            }
            else{
                e =mid-1;
            }
        }System.out.println(index);
        System.out.println(steps);
    }
}
