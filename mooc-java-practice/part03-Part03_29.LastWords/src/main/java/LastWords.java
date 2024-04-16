
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String input = scanner.nextLine();

            if(input.isEmpty()){
                break;
            }

            String[] phrase = input.split(" ");
            int length = phrase.length - 1;
            System.out.println(phrase[length]);

        }

    }
}
