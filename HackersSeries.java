import java.util.Scanner;

public class HackersSeries {
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner in = new Scanner(System.in);
            int t = 0, i = 0, j = 0, a = 0, b = 0, n = 0;
            long sum = 0;
            t = in.nextInt();
            for( i = 0; i < t; i++ ){
                in.nextLine();
                a = in.nextInt(); b = in.nextInt(); n = in.nextInt();
                sum = 0;
                for( j = 0; j < n; j++ ){
                    sum += Math.pow(2, j);
                    System.out.print( ( a + (sum * b) ) + " " );
                }
                System.out.println();
            }
        }
    }

