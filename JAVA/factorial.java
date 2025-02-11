import java.util.Scanner;
public class factorial {
    public int fact(int n)
    { 
        if(n==1)
        return 1;
        else if(n==0)
        return 0;
        else
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a NUmber:");
        num=sc.nextInt();
        factorial f = new factorial();
        System.out.print("Factorial of "+num+"is"+f.fact(num));
        sc.close();
    }
   
}
