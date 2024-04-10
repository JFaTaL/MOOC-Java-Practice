
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int ending = scanner.nextInt();

        System.out.println("Where from?");
        int staring = scanner.nextInt();

        for(int i = staring; i <= ending; i++){
            System.out.println(i);
        }
    }
}
