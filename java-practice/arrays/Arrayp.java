public class Arrayp {
    public static void main(String[] args) {
        int A[]=new int [10];
        int B []={1,2,3,4,5};
        int C[];
        C = new int [10];

        B[2]=14;
        for(int i = 0; i<A.length;i++){
            System.out.println(A[i]);

        }
        for(int i = 0; i<B.length;i++){
            System.out.println(B[i]);

        }
        for(int x:B){
            System.out.println(x++);
        }//this not work 
        for( int i=0; i<B.length;i++){
            System.out.println(B[i]++);
        }//this work
         for(int x:B){
            System.out.println(x);
        }
        System.out.println(B);
        System.out.println(B.length);
    }
}
