/**
 * Except2
 */
public class Except2 {

    public static void main(String[] args) {
        
        int i=10, j=0;

        int ar[] = new int[2];

        String str = null;

        try{
            //j=i/j;
            System.out.println(j);

           // System.out.println(ar[4]);
            System.out.println(str.length());
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Division by zero "+ae);
        }
        catch(ArrayIndexOutOfBoundsException ab)
        {
            System.out.println("Array limit exceed" +ab);
        }
        catch(NullPointerException ne)
        {
            System.out.println("String is null"+ ne);
        }
        catch(Exception e)
        {
            System.out.println("Exception caught");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}