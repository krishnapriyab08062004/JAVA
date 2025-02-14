 import java.util.Scanner;
 interface Showable {
    public void show();

    
}

class person implements Showable 
{ 
    String name,gender,phn;
    public person(String name,String gender,String phn)
    { 
        this.name=name;
        this.gender=gender;
        this.phn=phn;

    }

    public void show()
    { 
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Phone Number:"+phn);
    }
}


class student extends person 
{ 
    String course;
    int score;
    public student(String name,String gender,String phn,String course,int score)
    { 
        super(name,gender,phn);
        this.course=course;
        this.score=score;

    }
    
    public void show()
    { 
        super.show();
        System.out.println("Course:"+course);
        System.out.println("Score:"+score);
    }
   
    
    

}

class PGStudent extends student
{ 
    String resercharea,guide;
    public PGStudent(String name,String gender,String phn,String course,int score,String resercharea,
    String guide)
    { 
        super(name,gender,phn,course,score);
        this.resercharea=resercharea;
        this.guide=guide;

    }

    public void show()
    { 
        super.show();
        System.out.println("Research Area:"+resercharea);
        System.out.println("Guide:"+guide);
    }
}

public class PracticeDemo {
    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Students:");
        int n=sc.nextInt();
        PGStudent[] pg=new PGStudent[n];
        for(int i=0;i<n;i++)
        { 
            System.out.println("Enter Student Details:");
            System.out.println("Enter Name:");
            String name=sc.next();
            System.out.println("Enter Gender:");
            String gender=sc.next();
            System.out.println("Enter Phone Number:");
            String phn=sc.next();
            System.out.println("Enter Course:");
            String course=sc.next();
            System.out.println("Enter Score:");
            int score=sc.nextInt();
            System.out.println("Enter Research Area:");
            String resercharea=sc.next();
            System.out.println("Enter Guide:");
            String guide=sc.next();
            pg[i]=new PGStudent(name,gender,phn,course,score,resercharea,guide);
            System.out.print("\n");

           
            System.out.println("Student Details:");

            pg[i].show();
            



        }
        sc.close();
    }
    
}
