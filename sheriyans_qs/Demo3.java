import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*  System.out.print("Enter Your name: ");
        String name = sc.nextLine();
        System.out.print("Enter you age: ");
        int age = sc.nextInt();
        System.out.println("Your name is "+name +" and age is "+age); */
        
        System.out.println("Enter value of a and b");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("a= "+a +" b="+b);
        int c = a;
        a = b;
        b = c;
        System.out.println("after swapping:\n"+"a= "+a +" b="+b);
        int voido = 4;
        sc.close();
    }
}
