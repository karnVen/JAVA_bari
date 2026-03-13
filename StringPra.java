public class StringPra {

    public static void main(String[] args) {
        String str1 ="java";
        char c[]={'j','d','d'};
        String str2= new String(c,1,2);
        System.out.println(str2);
        System.out.println(str1);

        String str4= new String("java");
        String str5 ="java";

        System.out.println(str4==str5);
    }
}