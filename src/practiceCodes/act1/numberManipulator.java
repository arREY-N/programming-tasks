package practiceCodes.act1;

public class numberManipulator implements manipulatorInterface {
    public static int userNumber;

    /*
        The class numberManipulator implements the interface manipulatorInterface.
        With that, numberManipulator will use all the headings defined in the interface.
        In the interface, methods are purely headings. 
        The body of each method will then be defined by the implementing class (numberManipulator).
    */

    @Override
    public void showNumberPlus10(int userNumber) { // this is the heading
        // this is the body
        System.out.printf("%d plus 10 is %d.%n", userNumber, (userNumber+10));
    }
    @Override
    public void showNumberPlus100(int userNumber) {
        System.out.printf("%d plus 100 is %d.%n", userNumber, (userNumber+100));
    }
    @Override
    public void showNumberPlus1000(int userNumber) {
        System.out.printf("%d plus 1000 is %d.%n", userNumber, (userNumber+1000));
    }
}
