/*
enum Status
{
    Running, Failed, Pending, Success
}

public class Enums {
    public static void main(String[] args) {
        
       // Status s = Status.Failed;
        //System.out.println(s);
        //System.out.println(s.ordinal());

        // For printing the all values

        Status[] ss = Status.values();
        //System.out.println(ss[0]);

        for (Status s : ss) {
            System.out.println(s +" : "+s.ordinal());
        }
    }
}
*/
// Enum status by using if-else
/* 

enum Status
{
    Running, Failed, Pending, Success; 
}

public class Enums {

    public static void main(String[] args) {
        Status s = Status.Pending;

        if(s == Status.Running)
            System.out.println("All Good");

        else if (s == Status.Failed)
            System.out.println("Try Again");

        else if(s == Status.Pending)
            System.out.println("Please Wait");
        
        else
            System.out.println("Done");
    }    
}
*/

// enum status by using switch case
/* 
enum Status
{
    Running, Failed, Pending, Success;
}

public class Enums {

    public static void main(String[] args) {
        
        Status s = Status.Pending;

        switch(s)
        {
            case Running:
                System.out.println("All Good");
                break;

            case Failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("Please Wait");
                break;

            default:
                System.out.println("Done");
                break;
        }
    }    
}
*/
// Enum class
/* 
enum Laptop
{
    //Macbook(2000), Dell(1000), Lenovo(1200), Asus(1500); // Here price values are given

    Macbook(2000), Dell(1000), Lenovo, Asus(1500); // for default constructor. It take values from default constructor

    private int price;

    

    private Laptop() {
        price = 800; // it will call when the price is not declared for a constant product.
    }


    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    
}

public class Enums {

    public static void main(String[] args) {
        
        //Laptop lap = Laptop.Lenovo;
        //System.out.println(lap +" : "+ lap.getPrice());

        for(Laptop lap: Laptop.values())
        {
            System.out.println(lap +" : "+ lap.getPrice());
        }
    }    
}
*/
/* 
class A 
{
    public void show()
    {
        System.out.println(" In A show");
    }
}
class B extends A 
{

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("In B show");
    }
    
}


public class Enums {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
*/
// Functional Interface in Java
/* 
@FunctionalInterface
interface A 
{
    void show();
    //void run();
}

// class B implements A 
// {
//     public void show()
//     {
//         System.out.println("B Show");
//     }
// }


public class Enums {

    public static void main(String[] args) {
        A obj = new A()
        {
            public void show()
            {
                System.out.println(" In A show");
            }
        };
        obj.show();
    }
}
*/
// Lambda expressions works with only @FunctionalInterface
 /*    @FunctionalInterface
    interface A 
    {
        void show(int i, int j);
    }

    public class Enums {
    
        public static void main(String[] args) {

        //      A obj = new A()
        // {
        //     public void show()
        //     {
        //         System.out.println(" In A show");
        //     }
        // };

        // The given lambda expression equals to the above code
            A obj = (i, j) -> System.out.println("In show " + i + " "+ j);            
            obj.show(5,10);
            
        }
    }
    */

    // Lambda expressions works with only @FunctionalInterface

import java.lang.reflect.Method;

@FunctionalInterface
    interface A 
    {
        int add(int i, int j);
    }

    public class Enums {
    
        public static void main(String[] args) {

            A obj = (i, j) -> i+j;            
            int res = obj.show(5,10);
            System.out.println(res);
        }
    }

    Interface is divided into three types
    1) Normal Interface
        i) When we have two or more methods in an interface is called as Normal Interface.
    2) FunctionalInterface / Single Abstract Method(SAM)
        i) If we have only one method in an interface , it is called as FunctionalInterface / Single Abstract Method.
    3) Marker Interface
        i) It is an interface  has no mehtods is called as Marker Interface.