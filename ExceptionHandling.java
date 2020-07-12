public class ExceptionHandling {

    public static void main(String[] args) {

        try {
            System.out.println("Error Handling Code Begins");
            int a=20;
            int b=0;
            int divide=a/b;
            System.out.println(divide);

        }catch (Exception e){
           // e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("End");
        }

        finally {
            System.out.println("Connection Closed");
        }
    }
}
