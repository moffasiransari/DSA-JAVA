import java.util.Scanner;

public class Demo2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  // getting string as input
        System.out.println("Enter your full name");
        // method 1
         
     /*    String name = sc.next();
        // it will only reg the first string but not anything after space or enter 
        System.out.println("name = "+ name); */

        // method 2 

        // int a = sc.nextInt();
        // String fullName= sc.nextLine();
        // // it will register everything on that line 
        // /* eg: if on sc.nextint input you enter 20(press enter) 
        // nextint will take 20 but leave enter (also a character)
        // after that when nextline will go to buffer it will take that enter instead of waiting for you input*/
        // System.out.println("name = "+ fullName);
    
    // correct way
        int age = sc.nextInt();
        
        sc.nextLine();  //it will eat or take that enter and everything till end of line and make buffer empty again

        String fullName2= sc.nextLine(); // now it will again ask for input in consol as buffer is empty
        System.out.println(age + fullName2);
        char a = sc.next().charAt(0);
    }
}