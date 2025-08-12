package doubt.poc;

public class RememberArchitecture {

    public static void main(String[] args) {

        int firstNumber =3;
        int secondNumber =4;
        boolean bigger = compareNumbers(firstNumber,secondNumber);
        if(bigger)
            System.out.println("first number is bigger");
        else
            System.out.println("second number is bigger");

    }

    private static boolean compareNumbers(int firstNumber, int secondNumber) {

    return firstNumber > secondNumber;
    }
}
