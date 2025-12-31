
public class Main {

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int a = 5;
        fibonacci(a);
        
    }

    //create fibonacci method
    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", a);
            c = a + b;
            a = b;
            b = c;
        }
    }

    //create method to print even number from list of numbers
    public static void printEvenNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.printf("%d ", numbers[i]);
            }
        }
    }
}