
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        if(numberOne > numberTwo){
            System.out.println(numberOne + " is greater than " + numberTwo + ".");
        }else if (numberOne < numberTwo){
            System.out.println(numberOne + " is smaller than " + numberTwo + ".");
        }else{
            System.out.println(numberOne + " is equal to " + numberTwo + ".");
        }

    }
}
