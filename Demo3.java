class A{
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int a){
        super();
        System.out.println("In A int");
    }
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("In config");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int a){
        this();
        System.out.println("in B int");
    }
}

public class Demo3 {
    public static void main(String a[]){
        B obj = new B();
        B obj1= new B(5);


        obj1.show();
        obj1.config();
        
    }
    
}
