import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      /*  Syntax of for loops
          for(initilization;condtion;increment/decrement{
                //body
          }
           */
        //Print no. from 1 to 5
        /*for(int i=1;i<=5;i++){
            System.out.println(i);
        }*/
       /* int n = input.nextInt();
        for(int i = 1; i<= n; i ++ ){
            System.out.println(i);
        }*/

        //while loops
        /*syntax
               while(condition){
               body
               }
                */

       /* int num = 1;
        while (num<=5){
            System.out.println(num);
            num+=1;
        }*/

        //do while

      /*  do{

        }while();*/
        int n = 1;
        do{
            System.out.println(n);
            n++;
        }while(n<=5);
    }
}
