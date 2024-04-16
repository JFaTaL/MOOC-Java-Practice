
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String totalWords = input;
        while(!input.isEmpty()){
            input = scanner.nextLine();
            totalWords += " " + input;
        }

        String[] splitWord = totalWords.split(" ");

        for(String words : splitWord){
            if(words.contains("av")){
                System.out.println(words);
            }

        }

    }
}
