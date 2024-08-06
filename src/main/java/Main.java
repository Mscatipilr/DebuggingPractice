import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //test average method
        ArrayList<Integer> arrayOfNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(average(arrayOfNumbers));
        //ArrayList<Integer> arrayOfNumbers2 = null;
        //average(arrayOfNumbers2);
        //arrayOfNumbers.remove(5);
        System.out.println(sum(arrayOfNumbers));
    }

    //method to average integers
    public static double average(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return (double)sum/ numbers.size();
    }

    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
         //   sum -= number;
            sum += number;
        }
        return sum;
    }
}
/**NullPointer exception at line 19, called from line 11
 *IndexOutOfBoundsException@751 at line 12
 *I ran the debugger - it threw a null pointer exception. I set a conditional breakpoint for null pointer
 * exceptions and noted the lines that the debugger showed. Then commented the problem out since I do not
 * need a null array.
 * I did the same for index out of bounds.
 *
 * The logic error- the call is at 13 and when I step into it, it brings me to 19. As I stepped through the
 * method, I saw that the total kept decreasing, instead of increasing. So I knew to change the math sign
 * from '-' to '+'. I used evaluate to verify this as the fix first.
 */
