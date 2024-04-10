
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int numberOne = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int numberTwo = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        int numberThree = Integer.valueOf(scanner.nextLine());

        double sum =  numberOne + numberTwo + numberThree;
        double avg = sum / 3;

        System.out.println("The average is " + avg);

    }
}
