import java.util.Scanner;

public class ArrayChallange9_3 {
    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,13,10,};
         int sum = 0;
        for(int i =0; i<A.length; i++){
           
            sum=sum+A[i];
        }
        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i =0; i<A.length; i++){
            if(A[i]==a){
                System.out.println(i);
                System.exit(0);
            }
        }

        int max= A[0];
        int second=A[0];
        for (int i =0;i<A.length;i++){
            if(max<A[i]){
                max=A[i];  
            }else if (second<A[i]){
                second=A[i];
            }
        }
        System.out.println(max);
        System.out.println(second);
       
    }
    
}
