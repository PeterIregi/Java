
class calc{

    int a;
    public int add(int num1, int num2){
        System.out.println("in add");
        int r = num1 + num2;
        return r;

    }
}
class Computer{
    public void PlayMusic(){
        System.out.println("playing music");
    }
    public  String getMeAPen(int cost){
        if(cost >= 10){
            return "A pen";
        }else{
            return "Nothing";
        }
        
    }

}

class Calculator{

    int num = 5;


    public int add(int n1, int n2, int n3){
        System.out.println(num);
        return n1+n2+n3;
    }
    public int add(int n1, int n2){
        System.out.println(num);
        return n1+n2;
    }
    public double add(double n1, int n2){
        System.out.println(num);
        return n1+n2;
    }

}

public class Class {
    public static void main(String a []){

        int num1 = 4;
        int num2 = 5;

       // int result = num1 + num2;
        // System.out.println(result);

        calc calc = new calc();
        int result = calc.add(num1, num2);
        System.out.println(result);

        Computer comp = new Computer();
        comp.PlayMusic();
        String p = comp.getMeAPen(result);
        System.out.println(p);

        Calculator C = new Calculator();
        int res2 = C.add(10,12);
        System.out.println(res2);

        Calculator D =new Calculator();
        D.num =10;
        System.out.println(D.num);
        System.out.println(C.num);

    }
}
