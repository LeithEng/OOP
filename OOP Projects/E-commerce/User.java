import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public abstract class User {
    protected String username;
    protected String password;
    public User(String username, String password)
    {this.username=username;
    this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void ShowUser()
    {
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);
    }
}

class Admin extends User
{

    Admin(String username, String password)
    {super(username,password);}
    @Override
    public void ShowUser() {
        super.ShowUser();
        System.out.println("Role: Admin");
    }
}

class Customer extends User {
    private double balance;
    private ArrayList<Product> ShoppingCart;
    private int LoyaltyPoints;

    Customer(String username, String password, double balance) {
        super(username, password);
        this.balance = balance;
        ShoppingCart = new ArrayList<>();
        LoyaltyPoints = 0;
    }

    @Override
    public void ShowUser() {
        super.ShowUser();
        System.out.println("Current balance: " + balance);
        System.out.println("Loyalty points: " + LoyaltyPoints);

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        LoyaltyPoints = loyaltyPoints;
    }

    public ArrayList<Product> getShoppingCart() {
        return ShoppingCart;
    }

    public double getBalance() {
        return balance;
    }

    public int getLoyaltyPoints() {
        return LoyaltyPoints;
    }

    public void AddBalance(double b) {
        balance += b;
    }

    public void AddToCart(Product P) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many units of this product would you like to add to the cart?");
        int q= sc.nextInt();
        if (q>P.getQuantity_in_stock())
        {
            System.out.println("The quantity available in stock isn't enough to satisfy your order" );
        }
        else{
            int i=0;
            while (i<q)
            { ShoppingCart.add(P);
                i++;}
        }

    }

    public void RemoveFromCart(String n) {
        boolean exists = false;
        int i=0;
        while(i<ShoppingCart.size() && !exists) {
            if (ShoppingCart.get(i).getName().equals(n)) {
                ShoppingCart.remove(i);
                exists=true;
            }
            i++;
        }
        if(!exists) {
            System.out.println("This product isn't in the shopping cart");
        }
    }

    public double TotalCartCost() {
        double c = 0;
        for (int i = 0; i < ShoppingCart.size(); i++) {
            c += ShoppingCart.get(i).getPrice();
        }
        return c;
    }

    public void RateProduct(double r, Product P)
    {
        P.ratings.add(r);
    }
    public Map<String, Integer> countProductOccurrences() {
        Map<String, Integer> productOccurrences = new HashMap<>();
        for (Product product : ShoppingCart) {
            String productName = product.getName();
            productOccurrences.put(productName, productOccurrences.getOrDefault(productName, 0) + 1);
        }

        return productOccurrences;
        }
    public void AddFeedback(Product P)
    {   Scanner s=new Scanner(System.in);
        System.out.println("Please enter your feedback: ");
        String f=s.nextLine();
        P.feedback.add(f);

    }

    public void ShowCart()
    {   if(ShoppingCart.size()==0)
        {
            System.out.println("Your shopping cart is empty!");
            return;
        }
        for (Product p : ShoppingCart)
        {
            System.out.println("***********");
            p.ShowProduct();
        }
    }

    public void EmptyCart()
    {   ShoppingCart.clear();
        System.out.println("Shopping cart emptied!");}
    }

