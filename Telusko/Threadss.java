// In every thread we need to have a run method.
// These two methods running at the same time
/* 
class A extends Thread

{
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hi " + i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            ;

        }
    }
}

class B extends Thread {
    public void run() {

        for (int i = 1; i <= 100; i++) {
            System.out.println("hello " + i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}

public class Threadss {

    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        // System.out.println(obj1.getPriority());
        // System.out.println(obj2.getPriority());

        // obj1.setPriority(Thread.MAX_PRIORITY);
        // obj2.setPriority(Thread.MIN_PRIORITY);
        // obj2.setPriority(Thread.NORM_PRIORITY);
        obj1.start();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        obj2.start();
    }
} 
*/
// Runnable vs Threads
/* 
// class A implements Runnable
// {
//     public void run()
//     {
//         for (int i = 1; i<=5; i++) {

//             System.out.println("hi");

//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }

    
// }

class B implements Runnable
{
    public void run()
    {
        for (int i = 1; i <= 5; i++) {

            System.out.println("hello");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }   
}


public class Threadss {

    public static void main(String[] args) {

       // Runnable obj1 = new A();
    
       // by anonymous object
       Runnable obj1 = new Runnable() {
            public void run()
            {
            for (int i = 1; i <= 5; i++) {

                System.out.println("hi");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            }
       };
       Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
*/

/// by using lambda expression
/*
public class Threadss {

    public static void main(String[] args) {
        
        Runnable obj1 = () ->{

            for (int i = 1; i <=5; i++) {
                System.out.println("h1");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () ->{

            for(int i=1; i<=5; i++)
            {
                System.out.println("hello");

                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
*/

class Counter
{
    int count;
    //public synchronized void increment() // get exactly value is 20000
    public void increment() // get random values other than 20000
    {
        count++;
        //System.out.println(count);
    }
}

public class Threadss {

    public static void main(String[] args) throws InterruptedException {
        
        Counter c = new Counter();
            
        Runnable obj1 = () ->
        {
            for(int i=1; i<=10000;i++)
            {
                c.increment();
            }
        };

        Runnable obj2 = () -> 
        {            
            for(int i=1; i<=10000; i++)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}