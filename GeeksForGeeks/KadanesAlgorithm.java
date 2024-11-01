
// Kadane's Algortithm
// maximum contiguous sub array sum
/*
 * 
 * Given an array Arr[] of N integers. Find the contiguous sub-array(containing
 * at least one number) which has the maximum sum and return its sum.
 * 
 * 
 * Example 1:
 * 
 * Input:
 * N = 5
 * Arr[] = {1,2,3,-2,5}
 * Output:
 * 9
 * Explanation:
 * Max subarray sum is 9
 * of elements (1, 2, 3, -2, 5) which
 * is a contiguous subarray.
 * Example 2:
 * 
 * Input:
 * N = 4
 * Arr[] = {-1,-2,-3,-4}
 * Output:
 * -1
 * Explanation:
 * Max subarray sum is -1
 * of element (-1)
 * 
 * Your Task:
 * You don't need to read input or print anything. The task is to complete the
 * function maxSubarraySum() which takes Arr[] and N as input parameters and
 * returns the sum of subarray with maximum sum.
 * 
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 */
import java.util.*;

class KadanesAlgorithm {

    // arr: input array
    // n: size of array
    // Function to find the sum of contiguous subarray with maximum sum.
    public static long maxSubarraySum(int arr[], int n) {

        // Your code here
        long sum = 0;
        long large = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            large = Math.max(large, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return large;
    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int A[] = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }
        long res = maxSubarraySum(A, n);
        System.out.println(res);
    }

}