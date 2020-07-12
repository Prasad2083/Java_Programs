import java.util.Scanner;

public class HackersDatatypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to iterate the loop");
        int t=sc.nextInt();
        System.out.println("Enter number to set the data type");
        for (int i = 1; i <= t; i++) {
            long check = sc.nextLong();
            if (check >= -128 && check <= 127) {
                System.out.println(check + " " + "Number fit into byte");
            }
            if (check >= -32768 && check <= 32767) {
                System.out.println(check + " " + "Number fit into short");
            }
            if (check >= -2147483648 && check <= 2147483647) {
                System.out.println(check + " " + "Number fit into int");
            }
            if (check >= -9223372036854775808l && check <= 922337203685477580l) {
                System.out.println(check + " " + "Number fit into long");
            } else {
                System.out.println(check + " " + "Number doesn't fit");
            }

        }
    }
}
