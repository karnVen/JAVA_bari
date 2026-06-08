import java.util.Scanner;

public class Loop_challenge8_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        
        String ap="";
        String gp="";
        for (int i =0;i<n;i++){
            ap = ap+a +",";
            a=a+d;
            gp=gp+a+",";
            a=a*d;

            
        }
        System.out.println(ap);
        System.out.println(gp);
    }
    
}
