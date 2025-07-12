import java.util.Date;

public class ShippableProduct implements Shippable{
    private   double Weight;
    ShippableProduct(double weight)
    {
        this.Weight = weight;
    }
    @Override
    public double getWeight() {
        return Weight;
    }
    public void setWeight(double Weight)
    {
        this.Weight = Weight;
    }
}
