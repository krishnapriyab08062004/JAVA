/*import java.util.Scanner;
 class Student {
    String name;
    int rollno;
    int mark;
    static int c=0;
    public  Student()
    {   Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Name:");
        name = sc.nextLine();
        System.out.println("Enter the Roll No:");
        rollno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Mark:");
        mark=sc.nextInt();
        c++;
        sc.close();
    }

    public Student(String name,int rollno,int mark)
    { 
        this.name=name;
        this.rollno=rollno;
        this.mark=mark;
        c++;
    }

    public void display()
    { 
        System.out.print("Student Details:");
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Mark: " + mark);
    }

    public  static void sortRank(Student s[])
    {   
        int n=Student.c;
        for(int i=0;i<n;i++)
        { 
            for (int j=i+1;j<n;j++)
            { 
                if(s[i].mark < s[j].mark)
                { 
                    Student temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
       

    }
   
    
}

public class StudentDetails
{ 
    public static void main(String[] args) {
        
        Student s[] = new Student[10];
        for(int i=0;i<2;i++)
        {s[i]=new Student();
           
        }
        Student.sortRank(s);
        for(int i=0;i<2;i++)
        { 
        s[i].display();
        }
        
        
    }
}
*/


import java.util.Scanner;

class Student {
    String name;
    int rollno;
    int mark;

    public Student(Scanner sc) {
        System.out.print("Enter the Name: ");
        name = sc.nextLine();
        System.out.println();
        System.out.println("Enter the Roll No: ");
        rollno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Mark: ");
        mark = sc.nextInt();
    }

    public Student(String name, int rollno, int mark) {
        this.name = name;
        this.rollno = rollno;
        this.mark = mark;
    }

    public void display() {
        System.out.print("Student Details: ");
        System.out.println();
        System.out.println("NAME Roll_NO  MARK");
        System.out.println(name+" "+rollno+" "+mark);
       
    }
}

public class StudentDetails {
    public static void sortRank(Student s[]) {
        int n = s.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].mark < s[j].mark) {
                    Student temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s[] = new Student[2];
        for (int i = 0; i < 2; i++) {
            s[i] = new Student(sc);
        }
        sc.close();
        sortRank(s);
        for (int i = 0; i < 2; i++) {
            s[i].display();
        }
    }
}