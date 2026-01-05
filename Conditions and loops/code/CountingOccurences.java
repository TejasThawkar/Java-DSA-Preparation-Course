import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        int n = 578797997;
        int count = 0;
        while(n>0){
            int rem = n % 10;
            if(rem == 7){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);

    }
}
