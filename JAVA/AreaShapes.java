class Shapes
{ 
    double area(double l,double b,boolean isRectangle)
    {
        return l*b;
    }

     int area(int l,int b)
    {
        return l*b;
    }

    double area(double r)
    {
        return 3.14*r*r;
    }

    double area(double b,double h)
    {
        return 0.5*b*h;
    }

    int area(int s)
    {
        return s*s;
    }

    double area(double s,boolean isSquare)
    {
        return s*s;
    }
}

class AreaShapes
{ 
    public static void main(String[] args){ 
        Shapes obj = new Shapes();
        System.out.println("Area Of Rectangle with Length and breadth as Double datatype:"+obj.area(5.0,6.0));
        System.out.println("Area Of Rectangle with Length and breadth as int datatype:"+obj.area(5,6));
        System.out.println("Area Of Circle with Radius as Double datatype:"+obj.area(5.0));
        System.out.println("Area Of Triangle with Length and breadth as Double datatype:"+obj.area(5.0,6.0));
        System.out.println("Area Of Square with side as integer datatype:"+obj.area(5));
        System.out.println("Area Of Square with side as Double datatype:"+obj.area(5.0));




    }
}