public class GeeksDistinct {
  static int n=1000;
    public static void main(String[] args) {
        int ar[]={1,5,1,2,5,8,8,1,4,5,2};
        int l= (ar.length-1);
        distinct(ar,l);
        }
        public static void distinct(int ar[],int l){
         for (int i=0;i<=n;i++){
             int j;
             for (j=0;j<=i;j++)
                 if (ar[i]==ar[j])
                     break;
                 if (i==j)
                 System.out.println(ar[i]);

         }

        }
    }



