import java.util.Random;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Your Love Percentage is"+ " "+ Calculatelove("Varaprasad","Ruby") );

    }
    public static int Calculatelove(String yourname, String hername){
        Random calu=new Random();
        Random stringgen=new Random();
       // String test=stringgen.RandomStringUtils();
        int love=calu.nextInt(100);
        if (love>85){
            System.out.println("Love is eternal");
        }
        else if (love<50){
            System.out.println("Love is not true");
        }
        return love;
    }
}
