class A{
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int a){
        super();
        System.out.println("In A int");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int a){
        super(a);
        System.out.println("in B int");
    }
}

public class Demo3 {
    public static void main(String a[]){
        B obj = new B();
        B obj1= new B(5);

    }
    
}
