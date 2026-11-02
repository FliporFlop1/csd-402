import java.util.ArrayList;
import java.util.Scanner;

/**
 * CSD402 Module 8: Finds the largest Integer in an ArrayList.
 * The terminating zero is included in the list as required.
 */
public class JadonArgoArrayListTest {

    /**
     * Returns the largest value in the list, or zero if the list is empty.
     *
     * @param list the list of Integer values to examine
     * @return the largest value, or 0 when the list is empty
     */
    public static Integer max(ArrayList list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer largest = (Integer) list.get(0);
        for (Object item : list) {
            Integer value = (Integer) item;
            if (value > largest) {
                largest = value;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers one at a time. Enter 0 to finish.");
        while (true) {
            System.out.print("Enter an integer: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                scanner.next();
                continue;
            }

            int input = scanner.nextInt();
            numbers.add(input); // Include zero in the list.
            if (input == 0) {
                break;
            }
        }

        System.out.println("Values entered: " + numbers);
        System.out.println("Largest value: " + max(numbers));

        // Additional tests, including an empty list and negative-only values.
        System.out.println("Empty list test (expected 0): " + max(new ArrayList<Integer>()));
        ArrayList<Integer> negatives = new ArrayList<>();
        negatives.add(-8);
        negatives.add(-3);
        negatives.add(-12);
        System.out.println("Negative-only test (expected -3): " + max(negatives));
        scanner.close();
    }
}
