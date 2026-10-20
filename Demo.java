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

         //switch statements

         int d = 8;

         switch(d){
            case 1:
                System.out.println( "Monday");
                break;
            case 2:
                System.out.println( "Tuesday");
                break;
            case 3:
                System.out.println( "Wednesday");
                break;
            case 4:
                System.out.println( "Thursday");
                break;
            case 5:
                System.out.println( "Friday");
                break;
            case 6:
                System.out.println( "Saturday");
                break;
            case 7:
                System.out.println( "Sunday");
                break;
            default:
                System.out.println( "Enter a valid number");

         }

         String day = "Monday";


        switch (day){
            case "Saturday", "Sunday" -> System.out.println("6am");
            case "Monday" -> System.out.println("8am");
            default -> System.out.println("7am");
        }
        
        String res4 = "";

        switch(day){
            case "Saturday", "Sunday" -> res4 = "6am";
            case "Monday" -> res4 = "8am";
            default -> res4 = "7am";
        }
        System.out.println(res4);
         
         //returning without reassigning with every case

        String res5 = "";

        res5 = switch(day){
            case "Saturday", "Sunday" -> "6am";
            case "Monday" -> "8am";
            default -> "7am";
        };

        System.out.println(res5);
         
         
         
         
    }

}