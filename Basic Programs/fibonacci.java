import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int a = 0;
        int b = 1;
        int count = 1;

        while(count<num){
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
    
}
