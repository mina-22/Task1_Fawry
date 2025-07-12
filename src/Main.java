
import java.time.LocalDate;
import java.util.*;

public class Main {
  public static Customer customer= new Customer();
    public static ArrayList<Product> Products =new ArrayList<Product>();

    public static  void FillProducts() {
    LocalDate datenow = LocalDate.now();

    Products.add(new Product("Cheese" , 10 , 50 , new ExpirableProduct(datenow) , new ShippableProduct(100) ));
    Products.add(new Product("TV" , 500, 10 , null , new ShippableProduct(700) ));
    Products.add(new Product("Biscuits" , 20 , 12 , new ExpirableProduct(datenow) , new ShippableProduct(100) ));
    Products.add(new Product("Mobile scratch cards" , 20 , 3 , null ,  null));

}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FillProducts();
        System.out.println("Hello in food ordering system :)");
        String choice ;
        do{
            System.out.println("1-Press 1 if you want to add Product in Cart.");
            System.out.println("2-Press 2 if you want to make do checkout with items in Cart.");
            System.out.println("3-press any Key if you Want Exit.");
            choice = in.next();
            switch (choice) {
                case "1" :{
                    Transactions.DisplayAllProducts();
                }  break;
                case "2":customer.cart.CheckOut();
                    break;
                default: {
                    System.out.println("Thank You for using our system.");
                    return;
                }
             }

        }while(choice.equals("1") || choice.equals("2"));
    }
}
