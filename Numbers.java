public class Numbers {
    public static void main(String[] args) {
        int even=0,odd=0,res;
        for (int i=1;i<=10;i++){
            if (i%2==0){
                even= even+i;
            }
            else{
               odd=odd+i;
            }
        }
        res=even+odd;
        System.out.println(res*2);
        System.out.println("Even Numbers");
        System.out.println(even);
        System.out.println("Odd Numbers");
        System.out.println(odd);
    }
}
