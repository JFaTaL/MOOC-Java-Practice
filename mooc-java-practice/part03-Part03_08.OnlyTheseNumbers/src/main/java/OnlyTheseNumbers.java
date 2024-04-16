
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("From where?");
        int startNum = scanner.nextInt();
        System.out.println("To where?");
        int endNum = scanner.nextInt();

        for(int i = startNum; i <= endNum; i++){
            System.out.println(list.get(i));
        }

        // implement here finding the indices of a number
    }
}
