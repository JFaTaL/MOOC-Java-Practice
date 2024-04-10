
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of gift?");
        int gift = scan.nextInt();

        int tax;
        int deduction;
        double taxRate;

        if(gift >= 5000 && gift <= 24999){
            tax = 100;
            taxRate = 0.08;
            deduction = 5000;
            System.out.println("Tax: " + (tax + (gift - deduction) * taxRate));
        }else if(gift >= 25000 && gift <= 54999){
            tax = 1700;
            taxRate = 0.1;
            deduction = 25000;
            System.out.println("Tax: " + (tax + (gift - deduction) * taxRate));
        }else if(gift >= 55000 && gift <= 199999){
            tax = 4700;
            taxRate = 0.12;
            deduction = 55000;
            System.out.println("Tax: " + (tax + (gift - deduction) * taxRate));
        }else if(gift >= 200000 && gift <= 999999){
            tax = 22100;
            taxRate = 0.15;
            deduction = 200000;
            System.out.println("Tax: " + (tax + (gift - deduction) * taxRate));
        }else if(gift >= 1000000){
            tax = 142100;
            taxRate = 0.17;
            deduction = 1000000;
            System.out.println("Tax: " + (tax + (gift - deduction) * taxRate));
        }else{
            System.out.println("No Tax!");
        }
    }
}
