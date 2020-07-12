import java.util.Scanner;

public class HackersHasNext {
    public static void main(String[] args) {
        //Implementing hasNext() method
        Scanner sc=new Scanner(System.in);
        System.out.println("Implement HasNext() method for Integers");
        while (!sc.hasNextInt()){
            sc.next();
            System.out.println("Enter Only Integers");
        }
        System.out.println("The Integer Value"+" "+sc.nextInt());
    }
}
