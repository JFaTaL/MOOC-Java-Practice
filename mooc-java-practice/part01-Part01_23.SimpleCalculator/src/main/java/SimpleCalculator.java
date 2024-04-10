
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int numberOne = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int numberTwo = Integer.valueOf(scanner.nextLine());

        int sum = numberOne + numberTwo;
        int diff = numberOne - numberTwo;
        int prod = numberOne * numberTwo;
        double quotient = (double) numberOne / numberTwo;

        System.out.println(numberOne + " + " + numberTwo + " = " + sum);
        System.out.println(numberOne + " - " + numberTwo + " = " + diff);
        System.out.println(numberOne + " * " + numberTwo + " = " + prod);
        System.out.println(numberOne + " / " + numberTwo + " = " + quotient);


    }
}
