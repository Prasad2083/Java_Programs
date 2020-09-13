import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NumberFormatDemo {
    static double monthlyint;
    static double pricipal = 0;
    static double intrest;
    static int month;
    static double r;
    static int i;
    static int n;
    static double actualamtmonth;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Principal Amount :");
            pricipal = sc.nextInt();
            if (pricipal >= 1000 && pricipal <= 1000000) {
                break;
            }
            System.out.println("Enter number greater than 1000 and less than 1000000");
        }
        while (true) {
            System.out.println("Intrest Amount :");
            intrest = sc.nextDouble();
            if (intrest > 0 && intrest <= 30) {
                break;
            }
            System.out.println("Enter intrest greater than 0 and less than 30");
        }
        while (true) {
            System.out.println("Years :");
            month = sc.nextInt();
            if (month > 0 && month <= 30) {
                break;
            }
            System.out.println("Enter Months greater than 0 and less than 30 ");
        }
        NumberFormatDemo practice=new NumberFormatDemo();
        practice.calculatemonthly();
        NumberFormatDemo.calculateactualpermonth();
        System.out.println("Per Month int" + " " + monthlyint);
        System.out.println("Total int amt" + " " + monthlyint * n);
        double pric = pricipal / n;
        System.out.println("Per month actual amt" + " " + pric);
        double totalamt = (monthlyint * n) + pricipal;
        System.out.println("Total amount :" + totalamt);
        actualamtmonth = monthlyint + pric;
        System.out.println("Monthly payment:" + actualamtmonth);
        System.out.println(r);
        for (i = 1; i <= n; i++) {
            totalamt = totalamt - (actualamtmonth);
            NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.CANADA);
            String in = numberFormat.format(totalamt);
            System.out.println(in);
        }
    }

    public double calculatemonthly() {
        r = (intrest / 100) / 12;
        n = month * 12;
        monthlyint = pricipal * ((r * (Math.pow(1 + r, n))) / (Math.pow(1 + r, n) - 1));
        return monthlyint;
    }

    public static double calculateactualpermonth() {
        double pric = pricipal / n;
        double totalamt = (monthlyint * n) + pricipal;
        actualamtmonth = monthlyint + pric;
        for (i = 1; i <= n; i++) {
            totalamt = totalamt - (actualamtmonth);

        }
        return totalamt;
    }
}
