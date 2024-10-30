import java.io.*;
import java.util.*;

public class JavaLoops {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int i=0;i<q;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=a+b;
            int k=0;
            while(k<n){
                System.out.print(sum +" ");
                k++;
                sum += Math.pow(2,k)*b;
                
            }
            System.out.println();
        }
    }
}

/*
 Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98 
 */