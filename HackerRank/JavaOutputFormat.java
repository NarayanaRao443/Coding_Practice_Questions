import java.io.*;
import java.util.*;

public class JavaOutputFormat {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
       System.out.println("================================");
       for(int i=0;i<3;i++){
           String s = in.next();
           int a = in.nextInt();
           System.out.print(s);
           
           for(int j=0;j<15-s.length();j++){
               System.out.print(" ");
           }
           if(a>=0 && a<=9){
               String temp;
               temp = "00"+a;
               System.out.print(temp);
           }
           else if(a>=10 && a<=99){
               String temp;
               temp = "0"+a;
               System.out.print(temp);
           }
           else if(a>=100 && a<=999){
               String temp;
               temp = ""+a;
               System.out.print(temp);
           }
           System.out.println();
       }
       System.out.println("================================");
    
    
    }
}
/* 
Sample Input

java 100
cpp 65
python 50

Sample output:
================================
java           100 
cpp            065 
python         050 
================================
*/
/* 

import java.util.Scanner;

public class JavaOutputFormat {

public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d \n",s1,x);


        }
        sc.close();
        System.out.println("================================");

}
}
*/