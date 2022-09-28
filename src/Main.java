public class Main {
    public static void main(String[] args) {
        CoffeeKiosk ck = new CoffeeKiosk();
        ck.addMenuItem("drip coffee", 3);
        ck.addMenuItem("latte", 4);
        ck.addMenuItem("cappuccino", 3.5);
        ck.addMenuItem("mocha", 4);
        ck.newOrder();
    }
}