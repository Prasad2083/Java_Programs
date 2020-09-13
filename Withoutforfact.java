import java.util.Scanner;
public class Withoutforfact{
    static int fact=1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for factorial");
        int f1=sc.nextInt();
        Withoutforfact fanum=new Withoutforfact();
        fanum.factcal(f1);
        System.out.println(fact);
    }
    void factcal(int f1){
        if (f1>=1){
           fact=fact*f1;
           factcal(f1-1);
        }
    }
}