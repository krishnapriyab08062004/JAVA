import java.util.*;
class negativeException extends Exception {
    public negativeException(String message) {
        super(message);
    }
}
public class negativeInput
{   static int sum=0,c=0;
   
    public static void main(String[] args)
    { 
       
        Scanner sc = new Scanner(System.in);
        try{
            while(true)
            { 
                System.out.println("Enter a number: ");
                int n = sc.nextInt();
                
                if(n < 0)
                { throw new negativeException("Negative Number"); }
                else
                {c+=1;}
                sum +=n; 
                
              
            }
              
        }
        catch(Exception e)
    {
        System.out.println(e.getMessage()); 
        } 
        System.out.println("Count:"+c);       
        System.out.println("Average:"+sum/c);
    }
}

