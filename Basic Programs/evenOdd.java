import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
        predict();
    }

    public static void predict(){
        int a = 10;
        System.out.println(a++ + ++a);

    }
}
