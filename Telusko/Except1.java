/* 
public class Except1 {

    public static void main(String[] args) {
        int a=10,b=0,res;

        try {
            res = a/b;
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("division not possible");
        }
        System.out.println("hello world");
    }
}
*/


/*
public class Except1 {

    public static void main(String[] args) {
        int a=10,b=0,res;

        int ar[] = {1,2,3};

        try {
            res = a/1;
            ar[10]=100;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of bond");
        }
        System.out.println("hello world");
    }
}
*/

/*
public class Except1 {

    public static void main(String[] args) {
        int a=10,b=0,res;
        try {
            res = a/b;
        } 
        
         catch(ArithmeticException e)
        {
            System.out.println("division by zero");
        }
        
        
        catch (Exception e) {
            System.out.println("exception caught");
        }
       
    }
}
*/


 
// Nested Try-Catch block
/* 
public class Except1 {

    public static void main(String[] args) {
        try{
            int a=args.length;
            int b=10/a;
            System.out.println("a = "+a);

            try{
                if(a==1)
                    a=a/(a-a);
                if(a==2)
                {
                    int c[] = {1};
                    c[10]=100;
                }
            }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Array out of bounds");
                }        
            }
            catch(ArithmeticException e)
            {
                System.out.println("Division by zero");
            }
            System.out.println("limit exceed");
    }
}
*/

// throw statement

/*
public class Except1 {
    static void demoprec()
    {
        try{
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside demoprec");
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            demoprec();
        }
        catch(NullPointerException e)
        {
            System.out.println("Recaught: "+e);
        }
    }
}
*/

// finally block

import javax.management.RuntimeErrorException;

/**
 * Except1
 */
public class Except1 {
    static void procA()
    {
        try{
            System.out.println("procA");
            throw new RuntimeException("demo");
        }
        finally{
            System.out.println("proA finally");
        }
    }
    static void procB(){
        try{
            System.out.println("ProcB");
            return;
        }
        finally{
            System.out.println("procB finally");
        }
    }
    static void procC()
    {
        try{
            System.out.println("procC");
        }
        finally{
            System.out.println("procC finally");
        }
    }

    public static void main(String[] args) {
        try
        {
            procA();
        }
        catch(Exception e)
        {
            System.out.println("Exception caught");
        }
        procB();
        procC();
    }
}