package Store;

public class SalesmanAndBuyer {
    static Product product;
    static Boot boot = new Boot();

    public static void main(String[] args) {
        product = new Product("Phone", 350.99,
                "It's used to make calls", boot.setID());

        product = new Product("Phone", 350.99,
                "It's used to make calls", boot.setID());

        boot.setCard(400);

        boot.buy(15);
        boot.buy(50);
    }
}