package EX1;

//Switch statements for Loop
//for (initialExpression; testExpression; updateExpression) {
//    // body of the loop
//For-loop is used when number of iterations are known and Do or while loop is used when number of iterations are unknown
public class SwitchrooLoops {

    public static void switchrooLoops(String args[]){

        char ch='x';
        switch(ch)
        {
            case 'a':
//                Using for loop
                int n = 5;
                for (int i = 1; i <= n; ++i) {
                    System.out.println("Java is fun");
                }
                break;

            case 'b':
                // Using while loop
                int i = 1, number = 5;
                // while loop from 1 to 5
                while(i <= number) {
                    System.out.println(i);
                    i++;
                }
                break;

            case 'x':
                int a = 1, b = 5;

                // do...while loop from 1 to 5
                do {
                    System.out.println(a);
                    a++;
                } while(a <= b);
                break;

            case 'y':
                System.out.println("Case4 ");
                break;
            default:
                System.out.println("Default ");
        }
    }
}
