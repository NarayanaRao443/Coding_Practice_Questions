
//Comparator is an inteface which is used for sorting with own logic
/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collectionss2 {
    public static void main(String[] args) {

        
        List <Integer> nums = new ArrayList<>();
        
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

       // Collections.sort(nums);

        System.out.println(nums);
        
    }
}
*/
// This is for Integers
/* 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collectionss2 {
    public static void main(String[] args) {
        
        Comparator<Integer> com = new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };

    
        
        List <Integer> nums = new ArrayList<>();
        
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums, com);
        //Collections.sort(nums);

        System.out.println(nums);
        
    }
}
*/

// This is for Students
/* 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student 
{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }    
    
}
class Collectionss2
{
    public static void main(String[] args) {

        Comparator<Student> com = new Comparator <Student>()
        {
            public int compare(Student i, Student j)
            {
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Student> studs = new ArrayList<>();

        studs.add(new Student(21,"Raju"));
        studs.add(new Student(12,"Navin"));
        studs.add(new Student(18,"Kumar"));
        studs.add(new Student(20,"Nelesh"));

       // for sorting
        Collections.sort(studs, com); 

        // for prints the values
        for (Student s : studs) {
             System.out.println(s);
        }        
       

        
    }
}
*/



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>
{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }    
    
    public int compareTo(Student that)
    {
        if(this.age > that.age)
            return 1;
        else 
            return -1;

    }
}
class Collectionss2
{
    public static void main(String[] args) {

        Comparator<Student> com = (Student i, Student j);
        
         //   {
                // 
            //     if(i.age > j.age)
            //         return 1;
            //     else
            //    return -1;
           // by using terninory operator
               return i.age > j.age ? 1 : -1;
            //};

            // by using lambda expression
        
             Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;
        List<Student> studs = new ArrayList<>();

        studs.add(new Student(21,"Raju"));
        studs.add(new Student(12,"Navin"));
        studs.add(new Student(18,"Kumar"));
        studs.add(new Student(20,"Nelesh"));

       // for sorting
        Collections.sort(studs, com); 

        // for prints the values
        for (Student s : studs) {
             System.out.println(s);
        }        
       

        
    }
}