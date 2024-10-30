/*
// Missing Number
 *Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
Example 2:

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9

Your Task :
You don't need to read input or print anything. Complete the function MissingNumber() that takes array and N as input  parameters and returns the value of the missing number.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


 */

import java.util.Scanner;

class MissingNumber {
    public static int missingNumber(int array[], int n) {
        // Your Code Here
        int sum = n * (n + 1) / 2;
        int sum2 = 0;

        /*
         * for(int i=0;i<array.length;i++){
         * sum2=sum2+array[i];
         * }
         */

        for (int i = 0; i < array.length - 1; i++) {
            sum2 = sum2 + array[i];
        }
        int mis;
        mis = sum - sum2;
        return mis;
    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int A[] = new int[n];

        /*
         * for(int i=0;i<array.length;i++){
         * sum2=sum2+array[i];
         * }
         */
        for (int i = 0; i < n - 1; i++) {
            A[i] = in.nextInt();
        }
        int res = missingNumber(A, n);
        System.out.println(res);
    }
}