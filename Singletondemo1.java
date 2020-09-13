public class Singletondemo1{
    private static Singletondemo1 instance=null;
    public String v;
    private Singletondemo1(){
       v="Implement Singleton";
    }
    public static Singletondemo1 getInstance(){
        if (instance==null){
            instance=new Singletondemo1();
        }
        return instance;
    }
}
class Singletonwork{
    public static void main(String[] args) {
        Singletondemo1 A=Singletondemo1.getInstance();
        Singletondemo1 B=Singletondemo1.getInstance();
        System.out.println("Another try for singleton :"+ A.v);
        System.out.println(A.hashCode());
        System.out.println("Another try for Singleton :"+ B.v);
        System.out.println(B.hashCode());
    }
}