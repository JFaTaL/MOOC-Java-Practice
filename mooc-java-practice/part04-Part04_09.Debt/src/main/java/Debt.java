public class Debt {
    private double balance;
    private double intrestRate;

    public Debt(double intitalBalance, double intitalIntrestRate){
        this.balance = intitalBalance;
        this.intrestRate = intitalIntrestRate;

    }

    public void printBalance(){
        System.out.println(this.balance);

    }

    public void waitOneYear(){
        this.balance *= this.intrestRate;
    }

}
