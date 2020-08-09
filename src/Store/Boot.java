package Store;

import java.util.Random;
public class Boot {
    double card;
    Random rand = new Random(100);
    protected int setID() {
        return rand.nextInt(100);
    }
    public void setCard(int card) {this.card = card;}
    public double getCard() {return this.card;}
    public void buy(int ID) {
        if(ID == SalesmanAndBuyer.product.get_ID() &&
                getCard() >= SalesmanAndBuyer.product.get_Price()) {
            System.out.println("you bouth " + SalesmanAndBuyer.product.get_Type() + "\n"
                    + "-------------------------------------------");
            this.card = getCard() - SalesmanAndBuyer.product.get_Price();
        }
        else System.out.println("the money in this card is not enough! "+"\n"+
                    "please use another card." + "\n" +
                    "-------------------------------------------");
    }
    public void SetBetweenPrice(double num1, double num2) {
        double first = num1;
        double second = num2;
        if (SalesmanAndBuyer.product.price >= first &&
                SalesmanAndBuyer.product.price <= num2) {
            System.out.println("products betweeen " + num1 + "$ and " + num2 + "$");
            SalesmanAndBuyer.product.get_Type();
            SalesmanAndBuyer.product.get_Price();
            SalesmanAndBuyer.product.get_Info();
            SalesmanAndBuyer.product.get_ID();
            System.out.println("-------------------------------------------");
        }
    }
}