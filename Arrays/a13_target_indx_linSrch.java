package Arrays;

public class a13_target_indx_linSrch {
    public static void main(String[] args) {
        //give the index of the target elemnt at first occurence
        //using linear search
        //if not find index = -1
       
        int m = 12;  //taget element
        int arr [] = {1,2,3,4,5,6,7,8,9,10,11,12,13} ;
        int index = -1;
        int steps = 0;

        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i]==m) {
                index = i;
                break;
            }
        }System.out.println(index);
        System.out.println(steps);


    }
}
