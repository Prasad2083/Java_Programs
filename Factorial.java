import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
	    // Implement scanner class to give user input
	    

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to get factorial of it");
        int num=sc.nextInt();
	System.out.println("Factorial of a number")
        int fact=1;
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
