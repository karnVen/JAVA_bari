class arrayChallange9_2{

    public static void main(String[] args) {
        int B[]={3,5,4,7,8,6,};
        int A[]= new int[10];
        int C[];
        C=new int[10];
        B[2]=15;
        // for (int i =0;i<A.length;i++){
        //     System.out.println(A[i]);
        // }
        for(int x:B){
            System.out.println(x++);
        }
        //for each only use to read array not modify it  




    }
}