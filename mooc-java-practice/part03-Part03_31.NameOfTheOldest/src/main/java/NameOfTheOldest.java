
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        String oldestName = "";
        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }

            String[] phrase = input.split(",");

            int age = Integer.valueOf(phrase[1]);
            if(age > oldestAge){
                oldestAge = age;
                oldestName = phrase[0];
            }
        }
        System.out.println(oldestName);
    }
}
