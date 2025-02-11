class Animal{ 
    private String species;
    int age,weight;
    String color;
    public Animal(String species, int age,int weight, String color) {
        this.species=species;
        this.age=age;
        this.weight=weight;
        this.color=color;
    }

    void display()
    { 
        System.out.println("Species:"+species+"Age:"+age+"Weight:"+weight+"Color:"+color);
    }



} 


class Dog extends Animal{
    private String name;
    private String owner;
    public Dog(String species, int age,int weight, String color,String name,String owner) {
        super(species, age, weight, color);
        this.owner=owner;
        this.name=name;
    }

    void display()
    { 
        super.display();
        System.out.println("Name:"+name+"Owner:"+owner);
    }
}

class cat extends Animal{
double taill;
String eyecolor,name;

public cat(String species, int age,int weight, String color,String name,String eyecolor,double taill)

}
class AnimalDemo
{ 
    public static void main(String args[])
{ 
    Dog d=new Dog("Mammal",3,230,"pink","PAW","Krishna");
    d.display();
}
}