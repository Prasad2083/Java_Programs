import java.util.ArrayList;
import java.util.List;

public class MethodCalling {
    public static void main(String[] args) {
        List <Object> Books=new ArrayList<>();
        Books.add("Vara");
        Books.add(15);
        Books.add(25);
        Books.add(15);
        Books.add(54);
        Books.add("Test");
        Books.add(454);
        Books.add(514);
        Books.add("fdnjsf");
        System.out.println(Books.size());
        System.out.println(Books.get(0));
        System.out.println(Books.hashCode());
        System.out.println(Books.remove(0));
        System.out.println(Books);
        System.out.println(Books.size());
    }
    }
