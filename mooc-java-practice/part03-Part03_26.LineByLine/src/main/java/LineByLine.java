
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String totalWord = input;
        while(!input.isEmpty()){
            input = scanner.nextLine();

            totalWord += " " + input;
        }

        String[] pieces = totalWord.split(" ");
        
        for(String words : pieces){
            System.out.println(words);
        }


    }
}
