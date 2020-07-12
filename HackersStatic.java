import java.util.Scanner;

public class HackersStatic {
    static int A;
    static int B;
    static int H;
    static {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height and width of //gm");
         B=sc.nextInt();
         H=sc.nextInt();
    }
    public static void main(String[] args) {
        if (B>0&&H>0){
            A=B*H;
        }
        else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        System.out.println("Area of //gm "+ " "+HackersStatic.A + " "+"Square Units");
    }
}
