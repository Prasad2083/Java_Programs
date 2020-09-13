import java.util.Scanner;

public class HackerStringtoInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to convert to String");
       int check = sc.nextInt();
       String c=String.valueOf(check);
       if (check>-100&&check<100) {
           if (check == Integer.parseInt(c)) {
               System.out.println("Good Job");
           }
       }
        else
            {
            System.out.println("Wrong answer");
        }
    }
}
