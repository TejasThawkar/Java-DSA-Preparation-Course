import java.util.Scanner;

public class CountingOccurrence{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int count = 0; 
        while (num>0){
            int rem = num % 10;
            if(rem == 3){
                count++;
            }
            num = num/10;
        }
         System.out.println(count);
    }
}