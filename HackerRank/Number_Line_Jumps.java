import java.util.*;
public class Number_Line_Jumps {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        //int ar[] = new int[n];
        //int br[] = new int[n];
        int s=0,s1=0;
        int ar[]={0,4};
        int br[]={3,2};
        for (int i = 1; i < ar.length; i++) {
            for (int j = 0; j < br.length-1; j++) {
                if(br[j]<br[j+1]){
                    System.out.println("No");
                    System.exit(0);
                }
                else{
                    s+=ar[i];
                    s1+=br[j+1];
                }
            }
        }
        if(s==s1){
            System.out.println("Yes");
        }

    }
}


/*
 *  public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
        if(x1>x2 && v1>v2){
            return "NO";
        }
        else if(x1<x2 && v1<v2){
            return "NO";
        }
        else if(v1==v2){
            return "NO";
        }
            if((x2-x1)%(v1-v2)==0 || (x1-x2)%(v2-v1)==0){
                return "YES";    
            }
        else {
            return "NO";
        }
    }
 */