
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");
        int number = scanner.nextInt();
        int count = 1;
        while(count <= number){
            printText();
            count++;
        }
    }
    
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
