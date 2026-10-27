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



    }
}