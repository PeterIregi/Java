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

        
    }
}