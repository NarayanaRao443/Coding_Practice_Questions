import java.io.*;
import java.util.*;

public class JavaStdInStdOut {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double b = in.nextDouble();
        String c = in.nextLine();
        in.close();
        
        System.out.println("String: "+c);
        System.out.println("Double: "+b);
        System.out.println("Int: "+a);
    }
}


/*
Sample Input

42
3.1415
Welcome to HackerRank's Java tutorials!
Sample Output

String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
*/

