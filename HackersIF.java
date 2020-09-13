import java.util.Scanner;

public class HackersIF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number ");
        int check=sc.nextInt();
        if (check%2==0){
            if (check>=2&&check<=5){
                System.out.println("Not Werid");
            }
            else if (check>=6&&check<=20){
                System.out.println("Werid");
            }
            else if (check>20){

                System.out.println("Not Werid");
            }
        }
        else {
            System.out.println("Werid");
        }
    }
}
