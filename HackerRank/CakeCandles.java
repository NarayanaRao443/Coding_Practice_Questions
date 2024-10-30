import java.util.Scanner;

public class CakeCandles {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int ar[] = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = in.nextInt();
        }

        int max = 0;
        for(int i=0;i<ar.length;i++){
            if(ar[i] > max){   
                max = ar[i];
            }
            
        }
        int count = 0;
         for (int i = 0; i < ar.length; i++) {
            if(ar[i] == max){
                count++;
            }
         }
        System.out.println(count);
    }
}

/*
The maximum height candles are  units high. There are  of them, so return .

Function Description

Complete the function birthdayCakeCandles in the editor below.

birthdayCakeCandles has the following parameter(s):

int candles[n]: the candle heights
Returns

int: the number of candles that are tallest
Input Format

The first line contains a single integer, , the size of candles[i] .
The second line contains  space-separated integers, where each integer  describes the height of candles[i].
*/


Sample Input 0

4
3 2 1 3
Sample Output 0

2