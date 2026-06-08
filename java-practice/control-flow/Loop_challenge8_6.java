class Loop_challenge8_6{
    public static void main(String[] args) {
        
        int n=905;
        int m=n;
        int count =0;
        int arm=0;
        int revers=0;
        String str="";
        
        for (int i = 1; n>0;i++){
            int l=n%10;
            
            n=n/10;
            count++;
            arm=l*l*l+arm;
            revers=revers*10+l;
            str=str+l;
           
            System.out.println(l);;
        }
          char c;
         for(int k =str.length()-1;k>=0;k--){
                 c = str.charAt(k);

                 switch (c) {
                    case '0':System.out.println("zero");
                        break;
                    case '1':System.out.println("one");
                        break;
                        case '2':System.out.println("tow");
                        break;
                        case '3':System.out.println("three");
                        break;
                        case '4':System.out.println("four");
                        break;
                        case '5':System.out.println("five");
                        break;
                        case '6':System.out.println("six");
                        break;
                        case '7':System.out.println("seven");
                        break;
                        case '8':System.out.println("eight");
                        break;
                        case '9':System.out.println("nine");
                        break;
                 
                    default:
                        break;
                 }
            
             
        }
        System.out.println(count);
        System.out.println(arm==m);
        System.out.println(revers);
        System.out.println(revers==m);
        System.out.println(str);
    }
}