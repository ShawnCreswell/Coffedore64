public class Item {
    private String name;
    private double price;
    private int index;

    //Constructor
    public Item(String name, double price, int index) {
        this.name = name;
        this.price = price;
        this.index = index;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getIndex() {
        return index;
    }
}