import java.util.*;
class Bitwise{
    public static void main(String[] args) {
        int x =10,y=6,a,b,c;
        //int x= 0b1010; 10 in byte
        //int y =0b0110;  6 in byte
        x=-0b1010;

        a=x&y;
        b=x|y;
        c=x<<1;
        y =x>>1;
        

        System.out.println(a +""+ b+""+c );
        System.out.println(String.format("%32s",Integer.toBinaryString(x)));
    }
}