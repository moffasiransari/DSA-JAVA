package sheriyans_qs;
import java.util.Scanner;

public class a24_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.next(); 
         
        
        switch (shape){
            case "circle" -> {
                int dim1 = sc.nextInt();
                System.out.println((double)Math.PI*dim1*dim1);
            }
            case "rectangle" ->{
                int dim1 = sc.nextInt();
                int dim2 = sc.nextInt(); 
                System.out.println(dim1*dim2);
            } 
            case "triangle" -> {//triangle
                int dim1 = sc.nextInt();
                int dim2 = sc.nextInt();  
                // int dim3 = sc.nextInt();
                // double s = ((double)dim1+dim2+dim3)/2;
                // System.out.println(s);
                // double area = Math.sqrt((s*(s-dim1)*(s-dim2)*(s-dim3)));
                double area = 0.5*dim2*dim1;
                System.out.println(area);
            }default -> System.out.println("Invalid input");
        }
    }
}
