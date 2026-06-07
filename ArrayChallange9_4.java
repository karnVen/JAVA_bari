public class ArrayChallange9_4 {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,};
        // int temp= A[0];

        // for(int i =1; i<A.length; i++){
           
        //   A[i-1]= A[i];
        // }
        // A[A.length-1]=temp;

        // for (int x:A){
        //     System.out.print(x);
        // }
       
        int last =A[A.length-1];
        System.out.println(last);
        for (int i=0; i<A.length;i++){
           A[i-1]= A[i];

           
        }
        A[0]=last;
        for(int Y:A){
            System.out.print(Y);
        }

        
    }
}
