
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = scanner.nextInt();
        int sum = 0;
        int count = 0;
        double average;

        while(number != 0){
            if(number > 0){
                sum += number;
                count++;
            }
            System.out.println("Give a number:");
            number = scanner.nextInt();
        }
        if(count > 0){
            average = ((double) sum / count);
            System.out.println(average);
        }else{
            System.out.println("Cannot calculate the average");
        }
    }
}
