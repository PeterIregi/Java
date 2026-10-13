class Data{
    public static void main(String a[]){
        System.out.println("New class");
        int num1 = 9;
        byte by = 127;
        short sh = 588;
        long l = 5854l;

        float marks = 6.5f;
        double d = 5.8;

        boolean b = true;
        
        char c = 'c';

        //literals
        int num =585;
        int numb1 = 0b101; //prints 5
        int numb2 = 0x7E; // prints 126
        int numb3 = 10_00_00_000; //prints 100000000

        double numb4 = 56;//prints 56.0
        double numb5 = 12e10; //prints 1.2E11
        float f = 5.8f;

        System.out.println(numb5);
        System.out.println(f);

        char ch = 'a';
        ch++;
        System.out.println(ch);

        //literals
        int numb = 0b101;//should print  5
        System.out.println(numb);

        byte b1 = 125;
        System.out.println(b1);

        int a1 = 256;
        System.out.println(a1);

        byte k = (byte)a1;//prints 0 cause it does modulus with the range
        System.out.println(k);

        float f1 = 5.6f;
        int t = (int)f1;
        System.out.println(t);
        

        byte a2 = 10;
        byte b2 = 30;

        int result = a2*b2;

        System.out.println(result);

        
        int p1 = 7 ;
        int p2 = 5 ;

        int outcome = p1 + p2;
        int outcome2 = p1 * p2;
        int outcome3 = p1 / p2;
        int outcome4 = p1 % p2;


        System.out.println(outcome);
        System.out.println(outcome2);
        System.out.println(outcome3);
        System.out.println(outcome4);

        p1 +=2;

        System.out.println(p1);



    }
}