class Zoo
{ 
    String name ,encl[];
    public Zoo(String name,String encl[])
    { 
        this.name=name;
        this.encl=encl;
    }

    public void display()
    { 
        System.out.println("Name:"+name);
        System.out.println("Enclosures:");
        for(String i:encl)
        System.out.println(i);
    }

    class Enclosure{
        
        String name,type,animals[];
        public Enclosure(String name,String type,String animals[])
        { 
            this.name=name;
            this.type=type;
            this.animals=animals;
        }

        public void display1()
        { 
            System.out.println("Name:"+name);
            System.out.println("Type:"+type);
            for(String i:animals)
            System.out.println(i);        }

    }

    static class zooInfo
    { 
        String add,phn;
        public zooInfo(String add,String phn)
        {
            this.add=add;
            this.phn=phn;

        }

        void display2()
        { 
            System.out.println("Address:"+add+"Phone:"+phn);
        }
    }
}


class ZooClass
{ 
    public static void main(String[] args) {
        String encl[]={"Area-1","Area-2"};
        String animals[]={"Lion","Tiger"};
        Zoo z=new Zoo(  "Tattekad",encl);
        Zoo.Enclosure en=z.new Enclosure("Zoo1","WildAnimals",animals);
        Zoo.zooInfo zi=new Zoo.zooInfo("Kerala","1234567890");
        z.display();
        en.display1();
        zi.display2();
    }

}