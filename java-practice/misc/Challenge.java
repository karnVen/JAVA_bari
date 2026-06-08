import java.util.Scanner;

class Challenge{
    public static void main(String[] args) {
        //1
       
        //2nd
        // int a =10011;
        // String str3=a+"";
        // System.out.println(str3.matches("[01]*"));
        // String b ="2398ABCD";
        // System.out.println(b.matches("[123456789ABCDEF]+"));
        //4TH
        // 
        //5th
        // String str= "avf     adfd      adf  ";
        // String a=str.replaceAll("\\s+"," ");
        // System.out.println(a)
        // 
        //6th
        Scanner sc = new Scanner(System.in);
        String a =sc.nextLine();
        if(a.matches("[01]*")){
            System.out.println("binary");
        }else if (a.matches("[0-7]*")){
            System.out.println("octal");
        }else if(a.matches("[0-7A-F]*")){
            System.out.println("hexa");
        }

        



    }
}