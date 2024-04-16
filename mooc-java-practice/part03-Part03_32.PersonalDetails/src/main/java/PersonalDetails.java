
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = ("");
        String longestName = ("");
        double total = 0;
        int count = 0;

        while (true){
            String input = scanner.nextLine();

            if(input.isEmpty()){
                break;
            }

            String[] phrase = input.split(",");

            int age = Integer.valueOf(phrase[1]);
            total += age;
            count++;

            name = phrase[0];

            if(name.length() > longestName.length()){
                longestName = name;
            }
            
        }
        System.out.println(longestName);
        double average = total / count;
        System.out.println(average);
    }
}
