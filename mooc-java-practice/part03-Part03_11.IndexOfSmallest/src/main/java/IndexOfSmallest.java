
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            System.out.println("Enter number");
            int input = scanner.nextInt();
            if(input == 9999){
                break;
            }

            list.add(input);
        }

        int smallest = list.get(0);
        int index = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < smallest){
                smallest = list.get(i);
                index = i;
            }

        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: " + index);


        
    }
}
