public class Test1{
    int number;
    String name;
    Test1(int number,String name){
        this.number=number;
        this.name=name;
        System.out.println(number);
        System.out.println(name);
    }
    public static void main(String[] args) {
        Test1 t1=new Test1(300,"Varaprasad");
    }
}