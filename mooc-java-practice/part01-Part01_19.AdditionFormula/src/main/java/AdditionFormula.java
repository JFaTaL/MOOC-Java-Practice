
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int numberOne = scanner.nextInt();

        System.out.println("Give the second number:");
        int numberTwo = scanner.nextInt();

        int sum = numberOne + numberTwo;

        System.out.println(numberOne + " + " + numberTwo + " = " + sum);

    }
}
