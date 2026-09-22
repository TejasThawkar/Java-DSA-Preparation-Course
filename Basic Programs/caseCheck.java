import java.util.Scanner;

public class caseCheck {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char ch = in.next().charAt(0);
    
    caseCheck(ch);
   
   }

   static void caseCheck(char ch){
    char a = 'a';
    char z ='z';
    if (ch >= a && ch<=z){
        System.out.println("Lowercase");
    }else{
        System.out.println("Uppercase");
    }
   }
}
