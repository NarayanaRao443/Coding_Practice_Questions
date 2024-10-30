
/* 
import java.util.ArrayList;
import java.util.Collection;

o
public class Collectionss {

    public static void main(String[] args) {
        
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        //nums.add("50");

        //System.out.println(nums);

        for(Object n : nums)
        {
            System.out.println(n);
        }
    }
}
*/


// List

//List can prints the duplicate(same) values also.
// It can prints the values in a sequence order
// It prints the index values also
/* 
import java.util.ArrayList;
import java.util.List;

public class Collectionss {

    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums.get(2));
        System.out.println(nums.size());
        System.out.println(nums.indexOf(5));

    }
}
*/

 
// Set

//Set can prints the unique values only. It doesn't allows the duplicate values. 
// It prints the values in non-sequence order. Not in order.
// Set not give values in sorted format
// It doesn't return the index values.

/* 
import java.util.HashSet;
import java.util.Set;

public class Collectionss {

    public static void main(String[] args) {
        
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(3);
        nums.add(4);
       // nums.add("3");

       // System.out.println(nums.getClass());
        for(int n : nums)
        {
            System.out.println(n);
        }
    }
    
}
*/

// Treeset

// It doesn't returns the duplicate values
//It prints the values in a sorted order
// It doesn't returns the index value

/* 
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;


public class Collectionss {

    public static void main(String[] args) {
        
       // Collection <Integer> nums = new TreeSet <Integer>();
        Set <Integer> nums = new TreeSet <Integer>();
      
        nums.add(10);
        nums.add(30);
        nums.add(5);
        nums.add(40);
        nums.add(20);
        nums.add(30);
        nums.add(20);

        
        for(int n : nums)
        {
            System.out.println(n);
        }
    }
}
*/

/* 
import java.util.Collection;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Collectionss {

    public static void main(String[] args) {
        
        Collection <Integer> nums = new TreeSet<Integer>();
        nums.add(20);
        nums.add(10);
        nums.add(5);
        nums.add(40);
        nums.add(0);

        // System.out.println(nums);

        // for (int i : nums) {
        //     System.out.println(i);
        // }

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
            System.out.println(values.next());

    }
}
*/

// Map is like a key-value pair
// It doesn't returns the key . If it has duplicate keys then the final key in the Map is printed only. Remaining keys are ignored.
// Key cannot be repeated. It is a unique.

// Set + List = Map

import java.util.HashMap;
import java.util.Map;

public class Collectionss {
    public static void main(String[] args) {
        
        Map <String, Integer> students = new HashMap<>();

        students.put("Zaya", 40);
        students.put("Raju", 50);
        students.put("Kumar", 30);
        students.put("Navin", 50);
        students.put("Rajesh", 60);
        students.put("Raj", 100);

        System.out.println(students);
        System.out.println(students.keySet());

        // for all keys : values

        for(String key : students.keySet())
        {
            System.out.println(key + " : "+ students.get(key));
        }
    }
    
}

