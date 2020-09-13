import java.util.Scanner;

public class HackersString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            if (i == 0) {
                System.out.println(s1 + "       " + x);
            }
            if (i == 1) {
                System.out.println(s1 + "       " + "0" + x);
            }
            if (i == 2) {
                System.out.println(s1 + "        " + "0" + x);
            }

            //Complete this line
        }
        System.out.println("================================");

    }
}
