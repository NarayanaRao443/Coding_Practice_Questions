/*
import java.util.*;
public class MinMaxSum {
    public static void main(String[] args) {
        
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        
        int min = 0, max=0;
        for(int i=0;i<n-1;i++){
            min = min+ar[i];
        }
        for(int i=1;i<n;i++){
            max = max+ar[i];
        }
        System.out.println(min +" "+max);
    }
}
*/
/**
 * MinMaxSum
 */
public class MinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }

    

public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long min = 0;
    long max = 0;
    Collections.sort(arr);
    
    for(int i=1;i<arr.size();i++){
        max += arr.get(i);
        min += arr.get(i-1);
    }
        System.out.print(min +" "+max);
    }

}

/* 
Example

The minimum sum is  and the maximum sum is . The function prints

16 24

 Sample Input

1 2 3 4 5
Sample Output

10 14 
*/

