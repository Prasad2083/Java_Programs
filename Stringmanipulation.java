import java.util.Scanner;

public class Stringmanipulation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a alphanumeric string to split aplhabets and numbers");
        String str=sc.nextLine();
        String s1=" ";
        int n1=0;
        for (int i=0;i<str.length();i++){
            char x=str.charAt(i);
            if (Character.isDigit(x)){
                n1=n1+x;
            }
            else {
                s1=s1+x;
            }
        }
        System.out.println(n1);
        System.out.println(s1);
    }
}