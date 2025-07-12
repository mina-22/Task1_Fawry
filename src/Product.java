public class Product {
    private String Name ;
    private double Price ;
    private int Quantity ;

    public Expirable expirable;
    public Shippable shippable;
    Product()
    {

    }
    Product(String Name , double Price , int Quantity ,Expirable expirable, Shippable shippable)
    {
        this.Name = Name ;
        this.Price = Price ;
        this.Quantity = Quantity ;
        this.expirable = expirable;
        this.shippable = shippable;
    }

    public String getName() {
        return Name;
    }
    public double getPrice(){
        return this.Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
