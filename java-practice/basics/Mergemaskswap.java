class Mergemaskswap{
    public static void main(StringPra[] args) {
     /*int a =10,b=15;
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println(a +" "+ b);   
    }
    */
  /*  byte a =9; byte b=12;
   byte c = 0;
   c=(byte) (c|a);
   b= (byte) (b<<4);
   c = (byte) (c|b);
    System.out.println(String.format("%32s",Integer.toBinaryString(c)));
    */

    byte a = 9 , b=12;
    byte c;
    c =(byte) (a<<4);
    c=(byte) (c|b);
    System.out.println((c&0b11110000)>>4);
    System.out.println((c&0b00001111));

    //by masking/oring we can read the byte numbers
    //by merging/anding we can update the byte numbers
}}