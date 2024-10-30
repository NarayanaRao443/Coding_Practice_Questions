 
public class Exceptions {

    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        int nums[] = new int[5];
        String str = null;

        try {
            j = 18 / i;
            //System.out.println(str.length());
            //System.out.println(nums[1]);
             System.out.println(nums[5]);
        }

        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero" + e);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Make it in perfect size " + e);
        }

        catch (NullPointerException e) {
            System.out.println("Please enter the string data " + e);
        }

        catch (Exception e) {

            System.out.println("Something went wrong " + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}



// Exception by using throw keyboard

/*
public class Exceptions {

    public static void main(String[] args) {

        int i = 2;
        int j = 0;

        try {
            j = 18 / 20;
            if (j == 0)
                throw new ArithmeticException(" I don't want to print zero ");

        }

        catch (ArithmeticException e) {
            System.out.println("this is default output " + e);
        }

        catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
*/

// Create our own exceptions
/* 
class OwnException extends Exception {
    public OwnException(String str) {
        super(str);
    }
}

public class Exceptions {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new OwnException("I don't want to print zero");
        }

        catch (OwnException e) {
            j = 18 / 1;
            System.out.println("that's the default output " + e);
        }

        catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }

}
*/
// Ducking Exception using throws keyword
/* 
class A {
    public void show() throws ClassNotFoundException {
        Class.forName("Enums");
    }
}

public class Exceptions {

    static {
        System.out.println("Class Loaded");
    }

    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
    }
}
*/

/*
import java.io.IOException;

public class Exceptions {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter a number ");

        int num = System.in.read();
        System.out.println(num - 48);
    }
}
*/
/* 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Exceptions {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter a number");

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num);

    }
}
*/
// finally block is used for closing the connections. Whether it is database or network connections.

// Exceptions with try - finally block
/*
public class Exceptions {

    public static void main(String[] args) {

        int i = 2;
        int j = 0;

        try {
            j = 18 / i;
            System.out.println(j);
        }

        // catch (Exception e) {
        // System.out.println("Something went wrong");
        // }

        finally {
            System.out.println("Bye");
        }

    }
}
*/

// output: 9 bye
/* 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Exceptions {

    public static void main(String[] args) throws NumberFormatException, IOException {

        int num;
        BufferedReader br = null;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }

        finally {
            br.close();
        }
    }
}
*/
/* 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exceptions {

    public static void main(String[] args) throws IOException {

        int num = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}

*/

