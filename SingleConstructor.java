import java.util.ArrayList;
import java.util.List;
public class SingleConstructor {
    private static SingleConstructor instance=null;
    List<Student> students=new ArrayList<>();
    private SingleConstructor() {
        for (int i = 0; i < 10; i++) {
            Student data = new Student();
            data.id=i;
            data.name="Student" + i;
            students.add(data);
            System.out.println(students.get(i).id);
            System.out.println(students.get(i).name);
        }
    }
    public static SingleConstructor getInstance(){
        if (instance==null){
            instance=new SingleConstructor();
        }
        return instance;
    }
}
class display{
    public static void main(String[] args) {
        SingleConstructor dis=SingleConstructor.getInstance();
        for (int i=0;i<dis.students.size();i++) {
            System.out.println("checking another instance"+ " "+dis.students.get(i).name);
            System.out.println("checking another instance"+" "+dis.students.get(i).id);
        }
        }
    }

