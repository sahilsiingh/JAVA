/ A Class that represents use-defined exception
 
class MyException extends Exception {
}
 
// A Class that uses above MyException
public class setText {
    // Driver Program
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            throw new MyException();
        }
        catch (MyException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}