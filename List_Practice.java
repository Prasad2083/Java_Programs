import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class List_Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        Integer num=sc.nextInt();
        List<Object> number=new ArrayList<>();
        number.add(11);
        number.add(12);
        number.add(15);
        number.add(54);
        number.add(21);
        number.add(21);
        number.add(84);
        number.add("Vara");
        for (int i =0;i<number.size();i++) {
            Object newnum = number.get(i);
            if (num.equals(newnum)) {
                System.out.println(num);
            }
        }
        System.out.println(number);
        //System.out.println(number.get(4));
        System.out.println(number.size());
    }
}
