public class SumOfEvenOdd {
    public static void main(String args[]) {
        {
            int n = 10;
            int evenSum = 0;
            int oddSum = 0;

            for (int i = 1; i <= 2 * n; i++) {
                // check even & odd
                if ((i & 1) == 0)
                    evenSum += i;
                else
                    oddSum += i;
            }
            // Sum of even numbers less then 17
            System.out.println("Sum of First " + n
                    + " Even numbers = " + evenSum);

            // sum of odd numbers less then 17
            System.out.println("Sum of First " + n
                    + " Odd numbers = " + oddSum);
        }
    }
}
