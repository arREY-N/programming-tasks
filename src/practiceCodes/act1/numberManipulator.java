package practiceCodes.act1;

public class numberManipulator implements manipulatorInterface {
    @Override
    public void showNumberPlus10(int userNumber) {
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
