public class Oops_Java{
    public static void main(String[] args)  {
        NewEmp ds= new NewEmp();
        ds.setSalary(13);
        ds.setHrs(20);
        double Totalsalary=ds.result();
        System.out.println(Totalsalary);
        double tax=(Totalsalary*6)/100;
        System.out.println(tax);
        double Actualsalary=Totalsalary-tax;
        System.out.println("Salary :" +Actualsalary);
    }
}
 class NewEmp {
    private int extrshrs;
    private double Salary;
    private int hrs;

     public void setSalary(double salary){
         this.Salary = salary;
if (Salary<=0){
    throw new IllegalArgumentException("Enter a valid number");
}
     }
     public double getSalary() {
         return Salary;
     }

     public int getHrs() {
         return hrs;
     }

     public void setHrs(int hrs)  {
         this.hrs = hrs;
         if (hrs<=0){
             throw new IllegalArgumentException("Enter valid hrs");
         }
     }
     public double result(int extrshrs) {

         return getSalary() *(getHrs() +extrshrs);
     }
     public double result(){
         return result(0);
     }

 }
