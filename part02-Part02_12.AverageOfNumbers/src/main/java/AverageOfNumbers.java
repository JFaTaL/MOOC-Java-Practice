
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = scanner.nextInt();
        int sum = 0;
        int count = 0;
        double average;

        while(number != 0){
            sum += number;
            count++;
            System.out.println("Give a number:");
            number = scanner.nextInt();
        }
        average = ((double)sum / count);
        System.out.println("Average of the numbers: " + average);
    }
}
