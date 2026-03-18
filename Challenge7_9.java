import java.util.Scanner;

class Challenge7_9{
    public static void main(String[] args) {
        //1st
    //     int a =1;
    // switch(a)
    // {
    //     case 1: System.out.println("monday");
    //     break;
    //     case 2: System.out.println("tuesday");
    // }

    String a ="ADD";
    String b= "SUB";
    String m="MUL";
    String d="DIV";
    Scanner sc = new Scanner(System.in);
    System.out.println("enter numbers");
    int num1=sc.nextInt();
    int num2 = sc.nextInt();
    System.out.println("enter opration");
    sc.nextLine();
    String option=sc.nextLine();

    switch(option){
        case "ADD": System.out.println(num1+num2);
        break;
        case "SUB":System.out.println(num1-num2);
        break;
        case "MUL": System.out.println(num1*num2);
        break;
        case "DIV": System.out.println(num1/num2);
    }

    
    }}
