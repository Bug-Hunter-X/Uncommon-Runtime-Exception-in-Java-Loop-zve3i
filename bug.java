public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 5) {
                // Simulate an error that would only happen on the 5th iteration
                throw new RuntimeException("Something went wrong!");
            }
        }
        System.out.println("Loop finished");
    }
}