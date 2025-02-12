import java.util.Scanner;

interface Comparable
{ 
    public double volume();
    public int compareByVolume(Comparable other);
}

class cuboid implements Comparable
{ 
    double l,b,h;
    public cuboid(double l,double b,double h)
    { 
        this.l=l;
        this.b=b;
        this.h=h;
    }
   public double volume()
   { 
    return l*b*h;
   }
   public int compareByVolume(Comparable other)
   { 
    if(this.volume()>other.volume())
    return 1;
    else if(this.volume()<other.volume())
    return -1;
    else
    return 0;
   }

}

class cylinder implements Comparable
{ 
    double r,h1;
    public cylinder(double r,double h1)
    { 
        this.r=r;
        this.h1=h1;
       
    }
   public double volume()
   { 
    return 3.14*r*r*h1;
   }
   public int compareByVolume(Comparable other)
   { 
    if(this.volume()>other.volume())
    return 1;
    else if(this.volume()<other.volume())
    return -1;
    else
    return 0;
   }

}



class Comparabledemo
{ 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length :");
        int l=sc.nextInt();
        System.out.println("Enter the Breadth :");
        int b=sc.nextInt();
        System.out.println("Enter the Height :");
        int h=sc.nextInt();
        System.out.println("Enter the Radius of the Cylinder :");
        int r=sc.nextInt();
        System.out.println("Enter the Height of the Cylinder :");
        int h1=sc.nextInt();
        cuboid c1=new cuboid(l,b,h);
        cylinder c2=new cylinder(r,h1);
        int res=c1.compareByVolume(c2);
        if(res<0)
        System.out.println("Volume of cuboid "+c1.volume()+"is smaller than volume of cylinder "+c2.volume());
        else
        System.out.println("Volume of cuboid "+c1.volume()+"is greater than volume of cylinder "+c2.volume());
        sc.close();
}
    }
    
   
    

