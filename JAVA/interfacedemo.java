import java.util.Scanner;
interface printable
{ 
    public void display();
    public void show();
}

interface computable
{ 
    
    public double area();
    public double perimeter();
    public double volume();
}

interface drawable
{ 
    public void draw();
}


  class Rectangle implements printable, computable, drawable
  { 
    double l,b;
    public Rectangle(double l, double b)
    { 
        this.l=l;
        this.b=b;
        
    }

    public void display()
    { 
        System.out.println("Rectangle("+l+","+b); 

    }
    public void show()
    {} 

    public double area()
    {return l*b; }

    
    public double perimeter()
    {return 2*l+b; }

    
    public double volume()
    {return 0;}
    

    public void draw()
    { 
        System.out.println("Drawing Rectangle");
    }

  }



  
  class Sphere implements printable, computable, drawable
  { 
    double r;
    public Sphere(double r)
    { 
        this.r=r;
      
    }

    public void display()
    { 
        System.out.println("Sphere("+r+")"); 

    }
    public void show()
    {} 

    public double area()
    {return 4*3.14*r*r; }

    
    public double perimeter()
    {return 2*3.14*r; }

    
    public double volume()
    {return (4.0/3.0)*3.14*r*r*r; }
    

    public void draw()
    { 
        System.out.println("Drawing Sphere");
    }

  }


public class  interfacedemo {
    public static void main(String args[])
    { 
      System.out.println("Enter the length of rectangle");
      Scanner sc = new Scanner(System.in);
      double l = sc.nextDouble();
      System.out.println("Enter the breadth of rectangle");
      double b = sc.nextDouble();
     System.out.println("Enter the radius of Sphere");
      double r = sc.nextDouble();
      Rectangle r1 = new Rectangle(l,b);
      Sphere r2 = new Sphere(r);
      System.out.println("Rectangle Details:");
      r1.display();
      r1.show();
      System.out.println("Area of rectangle is "+r1.area());
      System.out.println("Perimeter of rectangle is "+r1.perimeter());
     
      if(r1.volume()==0)
      {  System.out.println("No Volume For Rectangle");}
     
     
      r1.draw();
      sc.close();

      System.out.println("Sphere Details:");
      r2.display();
      r2.show();
      System.out.println("Area of Sphere is "+r2.area());
      System.out.println("Perimeter of Sphere is "+r2.perimeter());
      System.out.println("Volume of Sphere is "+r2.volume());
      r1.draw();
      sc.close();

    }
    
}
