public class Product {
    int id = -1;
    int price = 0;
    int quantity = 0;
    String name = "Shreya";

    Product(int id, int price, int quantity, String name) {
            this.id = id;
            this.price = price;
            this.quantity = quantity;
            this.name = name;
    }
    @Override
    public String toString() {
        return ("ID = "+ this.id + "  " +"Name "+ this.name  +" "+ "Price = $" + this.price  +" "+ "Quantity " +this.quantity + "\n");

    }    
}
