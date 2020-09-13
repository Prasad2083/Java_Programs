import java.util.Scanner;

public class HackerMath {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to print");
        int number=sc.nextInt();
        for (int i=2;i<=number;i++){
            for (int j=1;j<=10;j++){
                int mul=i*j;
                System.out.println(i+ "*"+ j +"="+mul);
            }

        }
    }
}
