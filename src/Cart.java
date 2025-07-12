import java.util.ArrayList;

public class Cart {
    public ArrayList<Product> products;
    public  int total;
    Cart (){
        products = new ArrayList<>();
    }

    public void  Additem(Product product)
    {
        products.add(product);
    }


    public void  ClearCart()
    {
        products.clear();
    }

    public  void CheckOut()
    {
        if(products.size() == 0)
        {
            System.out.println("Cart Is Empty");
            return;
        }
        System.out.println("\n\n");
        System.out.println("** Shipment notice ** ");
        double sum = 0;
        for(Product prod : products)
        {
            if(prod.shippable != null)
            {
                System.out.println(prod.getQuantity() + "x " + prod.getName() + "    " + prod.shippable.getWeight() *  prod.getQuantity()+"g");
                sum+=prod.shippable.getWeight() * prod.getQuantity() ;
            }
        }
        System.out.println("Total package weight " + sum / 1000.0+"KG");
        System.out.println("\n** Checkout receipt ** ");
         double subtotal = 0;
        for(Product prod : products)
        {

                System.out.println(prod.getQuantity() + "x " + prod.getName() + "    " + prod.getPrice() *  prod.getQuantity());
                 subtotal+=prod.getPrice() * prod.getQuantity() ;

        }
        double shipping = sum / 1000.0 * 5;
        System.out.println("Subtotal    " + subtotal);
        System.out.println("Shipping    " + shipping);
        System.out.println("Total       " +( subtotal + shipping));
        //   5 for each kilo
    }
}
