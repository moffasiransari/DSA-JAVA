import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("hii hello world");
        int a = 4;
        a = (int)(4.5);
        float b = 3.5f;
        float sum = (a + b);
        System.out.println("sum is = " + (a + b));
        System.out.println("sum is = " + sum);
        System.out.println("difference is = " + (a - b));
        System.out.println("product is = " + (a * b));  
        System.out.println(0363);
        System.out.print("hell");
        System.out.print("hell");
        System.out.println(0x101);
    //getting input from user
        /* below we get a resource leak warning mesg for sc and to close it 
        -> just a warning telling to close the object sc not error
        ->we should never close object using system.in as once close we will not be able to use it later 
        to take input in same code whiel the code is running */
        
        Scanner sc = new Scanner(System.in);
        /* int e = sc.nextInt();
        System.out.println("int value ="+ e); */

    /*  sc.close();
        Scanner sc2 = new Scanner(System.in);
        int e2 = sc.nextInt();
        will fail as scanner already closed 
        */     
        /*
    A Small Programm 
        System.out.print("enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("enter first number: ");
        int num2 = sc.nextInt();
        
        System.out.println("num1 = "+ num1 + "\nnum1 = "+ num2);
        System.out.println("sum of bothe no. is = "+(num1 + num2));
         */

    // How the input or scanner method works under the hood'
        // three phase program -> buffer -> output
        /* buffer store the values that we enter on the terminal temporarily than assigns to other variabls
        prgrame -> the program the we wrote
        output-> the output that program gives
        */
       System.out.print("enter first number: ");
    //    flow-> 1. since the aboce code is and ouput it directly goes to ouput stage
        int num1 = sc.nextInt();
        // now it wants an input so it goes to the buffer and asks if he has any int value to assign him
        // since we havn't enter anything so it buffer waits fo us to enter a value and when gets an int assgins it to num1
        System.out.print("enter first number: ");
        // goes to direct output stage
        int num2 = sc.nextInt();
        // againg asks buffer for a int value
        System.out.println("num1 = "+ num1 + "\nnum1 = "+ num2);
        // output

        /*Case 2: if while the entering the first value for num1 we enter two values 2 3 (space separates values)
        so buffer will first assign 2 to num1 and when num2 comes to him it will
        not wait for our response cause it will already have a int value 3 so it will directly assign it to num2 
         */ 

  


    }
}

