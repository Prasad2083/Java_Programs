/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int t=0;t<T;t++){
            s.nextLine();
            int N=s.nextInt();
            int M=s.nextInt();
            s.nextLine();
            int X=s.nextInt();
            int Y=s.nextInt();
            int S=s.nextInt();

            Queue<Integer> row=new LinkedList<Integer>();
            Queue<Integer> col=new LinkedList<Integer>();

            if(X!=0){
                s.nextLine();
                for(int i=0;i<X;i++){
                    row.add(s.nextInt());
                }
            }

            if(Y!=0){
                s.nextLine();

                for(int i=0;i<Y;i++){
                    col.add(s.nextInt());
                }
            }
            int count_r=0;
            int prev=0;
            while(!row.isEmpty()){
                int curr=row.poll();
                count_r+=((curr-prev-1)/S);
                prev=curr;
            }
            if(prev<N&&X!=0)
                count_r+=((N-prev)/S);
            if(X==0)
                count_r=N/S;
            int count_c=0;
            prev=0;
            while(!col.isEmpty()){
                int curr=col.poll();
                count_c+=((curr-prev-1)/S);
                prev=curr;
            }
            if(prev<M&&Y!=0)
                count_c+=(M-prev)/S;
            if(Y==0)
                count_c=M/S;

            System.out.println(count_r*count_c);
        }
    }
}
