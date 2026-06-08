import java.util.Scanner;

class Loop_challenge8_5{
    public static void main(String[] args) {
        //1. display multipication table

        for(int i=1;i<11;i++){
            System.out.println(5+" x "+i+" = "+ (i*5));
        }

        //2 find sum of n numbers
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
        int sum=0;
        for(int i=0; i<=n;i++){
             sum =sum+i;
            }
            System.out.println(sum);

        //3 factorial of a number
        int f =1;
        for(int i =1;i<=n;i++){
            f=f*i;
        }
        System.out.println(f);

        //
    }
}