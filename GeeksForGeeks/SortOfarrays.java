// sort of an arrays of 0s,1s,2s
/*
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.

Your Task:
You don't need to read input or print anything. Your task is to complete the function sort012() that takes an array arr and N as input parameters and sorts the array in-place.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/
// three pointers problem

import java.util.Scanner;

class SortOfarrays {
    public static int sort012(int a[], int n) {
        // code here

        int l = 0, h = n - 1, m = 0, temp;
        while (m <= h) {
            if (a[m] == 0) {
                temp = a[l];
                a[l] = a[m];
                a[m] = temp;
                l++;
                m++;

            } else if (a[m] == 1) {
                m++;
            } else if (a[m] == 2) {
                temp = a[m];
                a[m] = a[h];
                a[h] = temp;
                h--;
            }
        }
        return a;
    }

    // public static void main(String[] args) {
    // int n;
    // Scanner in = new Scanner(System.in);
    // n = in.nextInt();

    // int A[] = new int[n];

    // for (int i = 0; i < n; i++) {
    // A[i] = in.nextInt();
    // }
    // int res[] = new int[a];
    // System.out.println(res);
    // }
}