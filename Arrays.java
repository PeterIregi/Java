class Student{
    int rollno;
    String name;
    int marks;
}


public class Arrays{
    public static void main(String a[]){

        int nums[] = {3,7,2,4};
        int nums1[] = new int[4];



        nums[0] = 23;

        for(int i = 0; i<4;i++){
            System.out.println(nums[i]);
            System.out.println(nums1[i]);
        }
        int nums2[][] = new int[3][4];


         for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                nums2[i][j] = (int)(Math.random()*10);
            }
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(nums2[i][j] + " ");
            }
            System.out.println();
        }

        for (int n[]: nums2){
            for (int m : n ){
                System.out.print(m + " ");
            }
            System.out.println();

        }

        int nums3[][] = new int[3][];

        nums3[0] = new int[3];
        nums3[1]= new int[4];
        nums3[2]= new int[2];
            //populate the jagged array
        for (int i = 0; i < nums3.length; i++){
            for(int j= 0; j< nums3[i].length;j++){
                nums3[i][j]= (int)(Math.random()*10);

            }
        }
        //print the jagged array

        for(int m[]: nums3){
            for (int o:m){
                System.out.print(o + " ");
            }
            System.out.println();
        }
        int nums4[] = new int[6];

        nums4[0]=4;
        nums4[1] = 8;
        nums4[2] = 3;
        nums4[3] = 9;

        for(int i = 0; i < nums4.length;i++){
            System.out.println(nums4[i]);
        }
        
        Student s1 =  new Student();
        s1.rollno = 1;
        s1.name = "Peter";
        s1.marks =  90;


        Student s2 =  new Student();
        s2.rollno = 2;
        s2.name = "John";
        s2.marks =  95;


        Student s3 =  new Student();
        s3.rollno = 3;
        s3.name = "Mark";
        s3.marks =  98;


        Student students[] = new Student[3];

        students[0]=s1;
        students[1]=s2;
        students[2]=s3;


        for(int i =0; i<students.length;i++){
            System.out.println(students[i].name + " "  + students[i].marks );
        }
        


    }
}