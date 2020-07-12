import java.util.Scanner;
public class MultiAr{
    static String str;
    static int num;
    static{
        str="What is static";
        num=2083;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String to Reverse");
        int rev=sc.nextInt();
        int nrev=0,re=0;
        while (rev !=0){
            re=rev%10;
            nrev=nrev*10+re;
            rev=rev/10;
        }
        System.out.println(nrev);
        str();

    }
    public static void str(){
        System.out.println(str);
        System.out.println(num);
    }
}