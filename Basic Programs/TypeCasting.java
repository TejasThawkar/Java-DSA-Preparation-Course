import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

//        type casting
//        int num =(int)59.34f;
//        System.out.println(num);

//        automatic type promotion in expression
//        int a= 257;  //257 % 256 = 1
//        byte b = (byte)(a);
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 70;
//        int f  = (a*b)/c;
//        System.out.println(f);

//          int num = 'a';
//        System.out.println(num);

        byte b = 54;
        char c = 'a';
        short s = 4525;
        int i = 45252;
        float f = 4.45f;
        double d = 0.35636;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println((f * b) +" " + (i / c)  +" " + (d - s));
        System.out.println(result);



    }
}
