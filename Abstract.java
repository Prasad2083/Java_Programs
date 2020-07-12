 class Student1226 {
    private int stndt;
    private String name;
    public Student1226(int stndt,String name){
        this.name=name;
        this.stndt=stndt;
    }
    public int getStndt(){
        return stndt;
    }
   /* public void setStndt(int stndt){
        this.stndt=stndt;
    }*/
    public String getName(){
        return name;
    }
   /* public void setName(String name){
        this.name=name;
    }*/
}
public class Abstract{
    public static void main(String[] args) {
        Student1226 check=new Student1226(1226,"Prasad");
        System.out.println(check.getName()+"    "+ check.getStndt());

    }
}