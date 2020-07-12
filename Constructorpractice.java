public class Constructorpractice {
    private static  Constructorpractice obj=null;
    private Constructorpractice(){

    }
    public static Constructorpractice objectcreationmethod(){
        if (obj==null){
            obj=new Constructorpractice();
        }
        return obj;
    }
    public void display(){
        System.out.println("SingleTon Practice");
    }

    public static void main(String[] args) {
        Constructorpractice object=Constructorpractice.objectcreationmethod();
        object.display();
    }
}
