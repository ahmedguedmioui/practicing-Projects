package Store;

class Product {
    protected String type;
    protected double price;
    protected String info;
    protected int ID;
    Product(String type, double price, String info, int id) {
        System.out.println("type : " + type);
        System.out.println("price : " + price + "$");
        System.out.println("info : " + info);
        System.out.println("ID : " + id);
        System.out.println("-------------------------------------------");
        this.type = type;   this.price = price;
        this.info = info;   this.ID = id;
    }
    protected String get_Type() { return this.type; }
    protected double get_Price() { return this.price; }
    protected String get_Info() { return this.info; }
    protected int get_ID() { return this.ID; }
}