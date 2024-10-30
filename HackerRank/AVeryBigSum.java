import java.util.*;
public class AVeryBigSum{
    public static void main(String args[]){
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        long ar[] = new long[n];
        for(int i=0;i<n;i++){
            ar[i] = in.nextInt();
        }
        
        long sum = 0;
        for(int i=0;i<n;i++){
            sum+= ar[i];
        }
            
        System.out.println(sum);
    }
}

/*
 Sample Input

5
1000000001 1000000002 1000000003 1000000004 1000000005
Output

5000000015
 */

 