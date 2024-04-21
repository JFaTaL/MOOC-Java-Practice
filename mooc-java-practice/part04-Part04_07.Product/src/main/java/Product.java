public class Product{
    private String name;
    private double price;
    private int quantity;

    public Product(String intialName, double intitalPrice, int intialQuantity){
        this.name = intialName;
        this.price = intitalPrice;
        this.quantity = intialQuantity;
    }

    public void printProduct(){
        System.out.println(name + ", price " +  price + ", " + quantity + " pcs");

    }
}
