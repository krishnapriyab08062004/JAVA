import java.util.Scanner;

class Person
{ 
    String name,gender,address;
    int age;

    public Person(String name,String gender,String address,int age)
    { 
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age;
    }


    void display()
    { 
        System.out.println("NAame:"+name+"Gender:"+gender+"Address:"+address+"Age:"+age);
    }
}

class Employee extends Person
{ 
    String emp_id,company_name,quali;
    double salaray;
    public Employee(String name,String gender,String address,int age,String emp_id,String company_name,double salaray)
    { 
       super(name,gender,address,age);
       this.emp_id=emp_id;
       this.company_name=company_name;
       this.salaray=salaray;
    }


    void display()
    { 
        super.display();
        System.out.println("Emp_id:"+emp_id+"Company Name:"+company_name+"Slaray:"+salaray);
    }
}


class Teacher extends Employee
{ 
    int t_id;
    String subject,dept;
    public Teacher(String name,String gender,String address,int age,String emp_id,String company_name,double salaray,int t_id,String subject,String dept)
    { 
        super(name, gender, address, age, emp_id, company_name, salaray);
        this.t_id=t_id;
        this.subject=subject;
        this.dept=dept;
        }

    void display()
    { 
        super.display();
        System.out.println("T_id:"+t_id+"Subject:"+subject+"Dept:"+dept);
    }    


}


    

    class EmployeeDemo
    { 
        public static void main(String[] args) {
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number of Teachers:");
            int n=sc.nextInt();
            Teacher[] e=new Teacher[n];
            for(int i=0;i<n;i++)
            {System.out.println("Enter Name");
            System.out.println();
            String name=sc.nextLine();
            
            System.out.println("Enter Gender");
            System.out.println();
            String gender=sc.nextLine();
            System.out.println("Enter Address");
            String address=sc.nextLine();
            System.out.println("Enter Age");
            int age=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Employee ID");
            String emp_id=sc.nextLine();
            System.out.println("Enter Company Name");
            String company_name=sc.nextLine();
            System.out.println("Enter Salary");
            double salaray=sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter Teacher id:");
            int t_id=sc.nextInt();
            System.out.println("Enter Subject:");
            String subject=sc.nextLine();
            System.out.println("Enter Department:");
            String dept=sc.nextLine();
            e[i]=new Teacher(name, gender, address, age, emp_id, company_name,salaray,t_id,subject,dept);
            e[i].display();
        }
            

        

           
        sc.close();
        }
       
    }