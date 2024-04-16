
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }

            String[] phrase = input.split(",");

            int age = Integer.valueOf(phrase[1]);
            if(age > oldestAge){
                oldestAge = age;
            }
        }
        System.out.println(oldestAge);
    }
}
