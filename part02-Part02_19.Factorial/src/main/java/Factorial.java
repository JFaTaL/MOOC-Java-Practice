
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int firstNumber = scanner.nextInt();

        int sum = 1;

        for(int i = 1; i <= firstNumber; i++){
            sum *= i;
        }
        System.out.println("Factorial: " + sum);

    }
}
