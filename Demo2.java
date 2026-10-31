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
    }
}