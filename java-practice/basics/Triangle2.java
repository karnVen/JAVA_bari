import java.util.Scanner;

class Triangle2{
    public static void main(StringPra[] args) {
        Scanner sc= new Scanner(System.in);

        float a = sc.nextFloat();
        float b =sc.nextFloat();
        float c =sc.nextFloat();
        float s = (a+b+c)/2;
        float area = s*(s-a)*(s-b)*(s-c);
        double farea= Math.sqrt(area);
        System.out.println(farea);

    }
}