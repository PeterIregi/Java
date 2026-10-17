import java.text.ListFormat.Style;

public class Demo{
    public static void main(String[] args){
        int x = 28;
        if (x>10 && x<=20) {//11-20
            System.out.println("Hello");
        }else{
            System.out.println("Bye");
        }
        int x1 = 5;
        int y1 = 12;
        int z1 = 8;

        if (x1>y1)
            System.out.println(x1);
        else
            System.out.println(y1);

        if (x1>y1 && x1>z1){
            System.out. println(x1);

        }else if(y1>z1){
            System.out.println(y1);
        }else {
            System.out.println(z1);
        }

        //ternary oprators
        int n = 5;
        int res1 = 0;
         if (n%2 ==0){
            res1 = 10;
         }else{
            res1 = 20;
         }
         System.out.println(res1);

         int res2 = n%2==0 ? 10 :20 ;
         System.out.println(res2);

    }

}