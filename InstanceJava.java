public class InstanceJava {
    int noofbooks;

     InstanceJava(String nameofthebook){

        System.out.println("Process Started");
         System.out.println("Name of the Book :" + nameofthebook);
    }
    public void setbooks(int number){
         noofbooks=number;
        System.out.println("No of Books Count :" + number);
    }

    public int getNoofbooks() {
        return noofbooks;
    }

    public static void main(String[] args) {
        InstanceJava test=new InstanceJava("Testing");
        test.setbooks(300);
        test.getNoofbooks();

    }
}
