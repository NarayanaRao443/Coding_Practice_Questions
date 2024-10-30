import java.util.*;
/**
 * Breakingbest
 */
public class Breakingbest {

    public static void main(String[] args) {
       //int ar[] = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        int ar[] = {3,4,21,36,10,28,35,5,24,42};
        int hs,ls;
        hs = ar[0];
        ls = ar[0];
        int hcount=0;
        int lcount=0;
        for (int i = 1; i < ar.length; i++) {
            
               if (ar[i]>hs){
                    hs=ar[i];
                    hcount++;
               }
               else if(ar[i]<ls){
                ls=ar[i];
                lcount++;
               }
        }
          System.out.println(hcount + " "+lcount);
    }
}


/*
 * 
 * 
 import java.util.*;
public class Solution{
    public static void main(String args[]){
        int n;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i] = in.nextInt();
        }
        int hs,ls,hcount=0,lcount=0;
        hs=ar[0];
        ls=ar[0];
        
        for(int i=0;i<n;i++){
          
            if(ar[i]>hs){
                hs=ar[i];
                 hcount++;
            }
               
            else if(ar[i]<ls){
                ls=ar[i];
                lcount++;
            }
            
        }
    System.out.println(hcount + " "+lcount);
        }
}
 */
/* 

 Sample Input 0

9
10 5 20 20 4 5 2 25 1
Sample Output 0

2 4


Sample Input 1

10
3 4 21 36 10 28 35 5 24 42
Sample Output 1

4 0
*/