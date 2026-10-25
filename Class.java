
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
        return "A Pen";
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
        

    }
}
