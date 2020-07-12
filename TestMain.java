import java.util.Scanner;

public class TestMain {
    public void mai(String args) {
        System.out.println("Vara");
    }

    public static void main() {
        System.out.println("fdsj");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String dc=sc.nextLine();
        System.out.println(dc);
        TestMain fd=new TestMain();
        fd.mai("fdjaj");
        TestMain.main();
        System.out.println("dkjnk");
    }
}
