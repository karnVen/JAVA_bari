import java.util.Scanner;

class Fibonacci{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        String fib="";
        for(int i =0;i<num;i++){
            c=a+b;
            fib=fib+ c +",";
            a=b;
            b=c;

        }
        System.out.print(fib);
    }
}