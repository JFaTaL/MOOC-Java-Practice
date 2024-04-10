
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int numberOne = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int numberTwo = Integer.valueOf(scanner.nextLine());

        double sum = (double) numberOne + numberTwo;
        double avg = sum / 2;

        System.out.println("The average is " + avg);

    }
}
