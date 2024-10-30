/*
import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4,5,7,6,2,3);

    // Normal for loop
        // for (int i = 0; i < nums.size(); i++) {
        //     System.out.println(nums.get(i));
        // }


    // enhance for loop

    nums.forEach(n -> System.out.println(n));

        // for(int n : nums)
        // {
        //     System.out.println(n);
        // }
        
    // forEach method

        // int sum = 0;
        // for (int n : nums) {
        //     if(n%2==0)
        //     {
        //         n = n*2;
        //         sum = sum+n;
        //     }
        // }
        // System.out.println(sum);
        
    }
}
*/


// About forEach method

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * StreamApi
 */
public class StreamApi {

    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4,5,7,3,6,2);

        // Consumer<Integer> con = new Consumer<Integer>() {
            
        //     public void accept(Integer n)
        //     {
        //         System.out.println(n);
        //     }
        // };
        //    nums.forEach(con);
            
     // by using lambda expression   
       // Consumer<Integer> con = n -> System.out.println(n);

       //nums.forEach(con);

    // also we don't need con object also, so we can remove the Consumer object

    nums.forEach(n -> System.out.println(n));
            
        

    }
}
