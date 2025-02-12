import java.util.Scanner;

interface Shapes
{ 
    public int area(int l,int b);
    public double peri(double r);
}

class Rectangle implements Shapes
{ 
   int l,b;
   public Rectangle(int l,int b)
   {this.l=l;
    this.b=b;}

    public int area(int l,int b)
    { 
          return l*b;
    }
    public int peri(int l,int b)
    { 
          return 2*l+b;
    }
}


class Circle implements Shapes
{ 
   double r;
   public Circle(double r)
   {this.r=r;
    }
     public double area(double r )
    { 
          return 3.14*r*r;
    }
    public double peri(double r)
    { 
          return 2*3.14*r;
    }
}
public class Menudriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        

                do
                {
                    System.out.println("\n1)Rectangle\n2)Circle\n3)Exit\n");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                    System.out.print("Enter length: ");
                    int l=sc.nextInt();
                    System.out.print("Enter breadth: ");
                    int b=sc.nextInt();
                    Rectangle r1=new Rectangle(l,b);
                    System.out.println("Area of Rectangle: "+r1.area(l,b));
                    System.out.println("Perimeter of Rectangle: "+r1.peri(l,b));

                    break;
                    case 2:
                    System.out.print("Enter radius: ");
                    double r=sc.nextInt();
                    Circle c1=new Circle(r);
                    System.out.println("Area of Rectangle: "+c1.area(r));
                    System.out.println("Perimeter of Rectangle: "+c1.peri(r));
                    break;
                    case 3:
                    System.out.println("EXIT");
            }
                
        }while(choice!=3);
    }
}
