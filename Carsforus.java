import java.util.ArrayList;
import java.util.List;

public class Carsforus {
    private static Carsforus instance=null;
    List<Cars> car=new ArrayList<>();
    private Carsforus(){
        Cars dataofcar=new Cars();
        for (int i=0;i<15;i++){
            dataofcar.name="Audi"+i;
            dataofcar.price="$15000"+i;
            car.add(dataofcar);
            System.out.println(car.get(i).name);
            System.out.println(car.get(i).price);
        }
    }
    public static Carsforus getInstance(){
        if (instance==null){
            instance=new Carsforus();
        }
        return instance;
    }
}
class cardisplay{
    public static void main(String[] args) {
        Carsforus display=Carsforus.getInstance();
       /* for (int i=0;i<display.car.size();i++){
            System.out.println("Car Instance"+ " "+ display.car.get(i).name);
            System.out.println("Car Instance"+ " "+ display.car.get(i).price);
        }*/


    }
}
