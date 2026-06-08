import java.util.Scanner;

public class Triangle{
    public static void main(StringPra[] args) {
        Scanner scanner = new Scanner(System.in);
        float base = Float.valueOf(scanner.nextLine());
        float hight = Float.valueOf(scanner.nextLine());

        float area = (base*hight)/2;

        System.out.println(area);

    }
}