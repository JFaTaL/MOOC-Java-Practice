
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int number = scanner.nextInt();
            if(number == -1){
                break;

            }

            list.add(number);
        }

        double sum = 0;
        for(int number : list){
            sum += number;
        }

        System.out.println("Average: " + sum/list.size());
        
    }
}
