import java.util.Scanner;

public class variables {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        float height = sc.nextFloat();
        boolean isStudent = sc.nextBoolean();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is Student: " + isStudent);
    }
}
