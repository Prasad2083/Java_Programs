import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to print *");
        int nu=sc.nextInt();
        System.out.println("Pattren 1");
        for (int i=1;i<=nu;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
        System.out.println("Pattren 2");
        for (int i=1;i<=nu;i++){
            for (int k=0;k<nu-i;k++){
                System.out.print(" ");
            }
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pattren 3");
        for (int i=1;i<=nu;i++){
            for (int j=0;j<nu-i+1;j++){
                System.out.print("*");
            }
           // System.out.println();

            for (int k=0;k<i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Pattren 4");
        for (int i=1;i<=nu;i++){
            for (int k=1;k<i;k++) {
                System.out.print(" ");
            }
            for (int j=1;j<=nu-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pattren 5");
        int mn=1;
        for (int i=1;i<=nu;i++){
            for (int k=1;k<=nu-i;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int m=1;m<mn;m++){
                System.out.print("*");
            }
            mn=mn+1;
            System.out.println();
        }
        }
    }

