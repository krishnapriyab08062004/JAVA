import Arithmetic.*;
import java.util.Scanner;

public class ademo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double b = scanner.nextDouble();
        add a1=new add(a,b);
        sub a2=new sub(a,b);
        mul a3=new mul(a,b);
        div a4=new div(a,b);
        System.out.println("ADDITION:"+ a1.calculate());
        System.out.println("SUBTRACTION:"+ a2.calculate());
        System.out.println("MULTIPLICATION:"+ a3.calculate());
        System.out.println("DIVISION:"+ a4.calculate());
        scanner.close();


    }
   
    
}
