public class AndroidJava {
    public static void main(String[] args) {

        AndroidJava te=new AndroidJava();
        te.test();
        testagin();
       int th= addtest(5,10);
        System.out.println("Testing the code :"+ th);
       int change= te.verify(54,85);
        System.out.println(change);

    }
    public void test(){
        System.out.println("Montreal");
        System.out.println("android");
        System.out.println("Test");
        System.out.println("agntest");
    }
    public static void testagin(){
        System.out.println("Android");
    }
    public static int addtest(int a,int b){

       int  add=a+b;
        return add;
    }
    public int verify(int q,int g){
        int addition = q+g;
        return addition;
    }
}
