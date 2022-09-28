import java.util.ArrayList;
public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<>();

    //Constructors
    public Order() {
        this.name = "Guest";
//        this.items = new ArrayList<>();
    }

    public Order(String name) {
        this.name = name;
//        this.items = new ArrayList<>();
    }

    //Class methods
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        return this.ready ? "Your order is ready." : "Thank you for waiting, your order will be ready soon.";
    }

    public double getOrderTotal() {
        double orderTotal = 0;
        for (Item item : this.getItems()) {
            orderTotal += item.getPrice();
        }
        return orderTotal;
    }

    public void display() {
        System.out.printf("Customer name: %s\n", this.getName());
        for (Item item : items) {
            System.out.printf("%s - $%.2f\n", item.getName(), item.getPrice());
        }
        System.out.printf("Total: $%.2f\n", this.getOrderTotal());
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}