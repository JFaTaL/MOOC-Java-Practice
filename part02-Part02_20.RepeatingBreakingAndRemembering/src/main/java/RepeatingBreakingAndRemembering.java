
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int number = scanner.nextInt();
        int sum = 0;
        int totalNumbers = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        while(number != (-1)){
            sum += number;
            totalNumbers++;
            if(number % 2 == 0){
                evenNumbers++;
            }else{
                oddNumbers++;
            }
            number = scanner.nextInt();
        }
        double average = ((double) sum / totalNumbers);
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + totalNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
    }
}
