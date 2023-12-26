import java.util.HashMap;
import java.util.Map;
public class Order {
    private static int id=0;
    private String date;
    private Customer user;
    private double total_cost;

    Order(String date, Customer user, double total_cost) {
        id++;
        this.date = date;
        this.user = user;
        this.total_cost = total_cost;
    }

    public void ShowOrder() {
        System.out.println("ID: " + id);
        System.out.println("Date: " + date);
        user.ShowUser();
        System.out.println("Total cost: " + total_cost);
    }

    public void CompleteOrder() {
        if(user.getBalance()< user.TotalCartCost())
        {
            System.out.println("Your balance isn't enough to complete this order");
            return;
        }
        else{user.setBalance(user.getBalance() - total_cost);
        double p = total_cost * 0.2;
        int n = (int) p;
        user.setLoyaltyPoints(user.getLoyaltyPoints() + n);
        if (user.getLoyaltyPoints()>100)
        { double j=user.getLoyaltyPoints()-100;
            user.AddBalance(j);
            System.out.println("Congrats, your loyalty points have surpassed 100 with this purchase, as such "+ j +" dinars have been added to your balance as a gift!");
            user.setLoyaltyPoints(0);

        }
            Map<String, Integer> m = user.countProductOccurrences();
            for (Product P : user.getShoppingCart()) {
                int q=m.get(P.getName());
                int k=P.getQuantity_in_stock();
                P.setQuantity_in_stock(k-q);
            }
            System.out.println("Order completed successfully!");
            user.EmptyCart();}



    }
}

