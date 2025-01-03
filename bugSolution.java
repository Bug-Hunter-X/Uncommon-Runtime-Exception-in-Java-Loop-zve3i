import java.util.logging.Level;
import java.util.logging.Logger;

public class MyClass {
    private static final Logger LOGGER = Logger.getLogger(MyClass.class.getName());

    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            try {
                if (i == 5) {
                    // Simulate an error that would only happen on the 5th iteration
                    throw new RuntimeException("Something went wrong!");
                }
            } catch (RuntimeException e) {
                LOGGER.log(Level.SEVERE, "An error occurred during loop iteration:" + i, e);
                // Handle the exception appropriately, e.g., retry, log, or exit
                break; // Exiting loop after catching the exception
            }
        }
        System.out.println("Loop finished");
    }
}