public class Demo2{
    public static void main(String a[]){
        String name = new String("Peter");
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("Hello" + name );
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" Iregi"));  


        name = name + " Iregi";

        System.out.println(name);
        
        String s1 = "Iregi";
        String s2 ="Iregi";

        System.out.println (s1==s2);

        StringBuffer sb = new StringBuffer("Peter");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Iregi");
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println(sb);

    }
}