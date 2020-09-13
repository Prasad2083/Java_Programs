public class PrimeDemo{
    public static void main(String[] args) {
        int i,j,flag=0;
        for (i=2;i<=100;i++){
            for (j=1;j<=i;j++) {
                if (i % j == 0) {
                    flag++;
                }
            }
            if (flag==2){
                System.out.println(i);
            }
            flag=0;
        }
    }
}