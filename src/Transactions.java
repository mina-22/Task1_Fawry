import java.time.LocalDate;
import java.util.Scanner;

public  class  Transactions
{
    public static void DisplayAllProducts() {
        int productNum  = Transactions.ChooseProduct();
        Product product = Main.Products.get(productNum -1);
        if(product.expirable != null)
        {
            if(product.expirable.getExpiryDate().isBefore(LocalDate.now()) )
            {
                System.out.println("product is expired");
                return;
            }
        }

        int quantity = Transactions.ChooseQuantity(productNum);

        product.setQuantity(product.getQuantity() - quantity);

        Product product2 = new Product(product.getName() ,product.getPrice(),quantity
                , product.expirable , product.shippable);

        for(int i =0 ;i<  Main.customer.cart.products.size() ;i++)
        {
            if(Main.customer.cart.products.get(i).getName().equals(product2.getName()) )
            {
                int q= Main.customer.cart.products.get(i).getQuantity();
                Main.customer.cart.products.get(i).setQuantity(q + quantity);
                return;
            }
        }

        Main.customer.cart.Additem(product2);
        System.out.println("Product is Added succ");
    }
    public static int ChooseProduct() {
        System.out.println("Choose Product by number");
        int cnt= 1;
        for(Product prod : Main.Products)
        {
            System.out.println(cnt + "-"+ prod.getName());
            cnt++;
        }
       int number =  chooseInLimitedSize(Main.Products.size());
       return  number;
    }
    public static int ValidNumber(String choice){
        int choicenum ;
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                choicenum = Integer.parseInt(choice);
                break;
            } catch (Exception ex) {
                System.out.println("Enter Valid number");
                choice = in.nextLine();
            }
        }
        return choicenum;
    }
    public static int chooseInLimitedSize(int size) {
        Scanner in = new Scanner(System.in) ;

        String choice = in.nextLine();
        int choicenum = ValidNumber(choice);

        while (choicenum <1 || choicenum > size) {
            System.out.println("Your choice out of restricted bounds");
            choice = in.nextLine();
            choicenum = ValidNumber(choice);
        }
        return  choicenum;
    }
    public  static int  ChooseQuantity(int prodNum){
        System.out.println("Choose Quantity\nAllowed "+ Main.Products.get(prodNum -1).getQuantity() );
        int number =  chooseInLimitedSize(Main.Products.get(prodNum -1).getQuantity());
        return number;
    }
}
