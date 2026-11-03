class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name = "phone";
        System.out.println("In static block");

    }
    public Mobile(){
        brand ="";
        price = 200;
        System.out.println("In constructor");

    }

    public void show(){
        System.out.println(brand + ": " + price + ": " + name );

    }
    public static  void show1(Mobile obj){
    
        System.out.println(obj.brand + ": " + obj.price + ": " + name );
    }
}
class Human{
    private int age ;
    private String name ;

    public Human(){
        System.out.println("In Constructor");
        name = "Peter";
        age = 13;
    }
    public Human(int a, String n){
        name = n;
        age = a;
    }

    public String getName(){
        return name;
    }
    public void setname(String n){
        name =n;
    }
    public int getage(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }



}

class A
{
    public A(){
        System.out.println("Object created");
    }
    public void Show(){
        System.out.println("in A Show");
    }
}

public class Demo2{
    public static void main(String a[]){
        String name = new String("Peter");
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("Hello" + name );
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" Iregi"));  


        name = name + " Iregi";

        System.out.println(name);
        
        String s1 = "Iregi";
        String s2 ="Iregi";

        System.out.println (s1==s2);

        StringBuffer sb = new StringBuffer("Peter");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Iregi");
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println(sb);
        sb.insert(5, " ");
        System.out.println(sb);
        sb.setLength(30);
        System.out.println(sb);
        System.out.println(sb.length());

        Mobile mob = new Mobile();
        mob.brand = "Apple";
        mob.price = 1500;
        Mobile.name = "Smart Phone";


        Mobile mob1 = new Mobile();
        mob1.brand = "Samsung";
        mob1.price = 1100;
        
        

        mob.show();
        mob1.show();

        Mobile.show1(mob1);

        Human p1 = new Human();
      

        System.out.println(p1.getName());

        Human p2 =new Human();
        Human p3 = new Human(18, "Damian");
        System.out.println(p2.getName());
        System.out.println(p3.getName());

        A obj = new A();
        obj.Show();
        //object creation
        new A().Show();//anonymus object 


    }
}