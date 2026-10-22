public class Loops {
    public static void main(String a[]){
        //repeat this statement four times
        //loops
        //while,do while loop , for loops
        // while loop
        int i  = 1 ;

        while(i<=5){
            System.out.println("Hi" + i) ;
            int j = 1;
            while(j<=3){
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye" + i);


        // Do while loops

        int i1 = 4;

        do {
            System.out.println("Hello" + i1);
            i1++;
        }while(i1<=4);
        

        // for loops

        for (int i2=1; i2<=4;i2++){
            System.out.println("Hello" + i2);

        }
        for(int i3=1;i3<=5;i3++){
            System.out.println("DAY" + i3);
            for(int j2 = 9;j2<=17;j2++){
                System.out.println(j2 + "00 Hours");
            }
        }
        
    }
}