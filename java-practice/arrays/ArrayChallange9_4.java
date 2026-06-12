public class ArrayChallange9_4 {
    public static void main(String[] args) {
        int A[]=new int[5];
         A[0]=1;A[1]=2;
        // int temp= A[0];

        // for(int i =1; i<A.length; i++){
           
        //   A[i-1]= A[i];
        // }
        // A[A.length-1]=temp;

        // for (int x:A){
        //     System.out.print(x);
        // }
       
        // int last =A[A.length-1];
        // System.out.println(last);
        // for (int i=0; i<A.length;i++){
        //    A[i-1]= A[i];

           
        // }
        // A[0]=last;
        // for(int Y:A){
        //     System.out.print(Y);
        // }


        //shifting an element 
        int x = 5;
        int index=2;
        int n =A.length;

        for(int i=n;i>index;i--){
        A[i]=A[i-1];
        A[index]=x;
        }

        for(int i = 0;i<n;i++){
            System.out.println(A[i]+",");
            System.out.println("");
        }
            

        


        
    }
}
