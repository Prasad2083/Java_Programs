public class SuperandThis {
    int d=14;
   static int k=15;
    public static void main(String[] args) {
        two dc=new two();
        dc.ss();
        SuperandThis  fv= new SuperandThis();
        fv.bb();
    }

    void bb(){
        System.out.println(this.d);// this keyword is used to refer to the instances with in the class out side the main method.
        System.out.println(this.k);
    }
}
class one{
    int a=11;
    static int b=16;

}
class two extends one{
    void ss(){
        System.out.println(super.a);// super keyword is used to refer the instances from different classes
        System.out.println(super.b);
    }

}
