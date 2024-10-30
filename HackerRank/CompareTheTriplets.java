import java.util.*;
public class CompareTheTriplets {
    public static void main(String[] args) {
        
      //  int m,n;
        Scanner in = new Scanner(System.in);
       // m = in.nextInt();
       // n = in.nextInt();

        int ar[] = new int[3];
        int br[] = new int[3];
        for (int i = 0; i < 3; i++) {
            ar[i] = in.nextInt();
        }

        for ( int i = 0; i < 3; i++) {
            br[i] = in.nextInt();
        }
        
        int alice = 0, bob=0;

        for(int i=0;i<3;i++){
                if(ar[i]>br[i])
                    alice++;
                else if(ar[i]<br[i])
                    bob++;       
        }
        System.out.println(alice +" "+bob);
    }
}

/* 
The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].

If a[i] > b[i], then Alice is awarded 1 point.
If a[i] < b[i], then Bob is awarded 1 point.
If a[i] = b[i], then neither person receives a point.
Comparison points is the total points a person earned.


Sample Input 0

5 6 7
3 6 10
Sample Output 0

1 1

17 28 30
99 16 8
Sample Output 1

2 1
*/