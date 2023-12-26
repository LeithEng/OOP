import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Admin> admins = new ArrayList<>();
    private static ArrayList<Customer> customers = new ArrayList<>();
    private static ArrayList<Order> completedOrders = new ArrayList<>();
    private static Inventory inventory = new Inventory();
    private static boolean isLoggedIn = false;
    private static Customer currentCustomer = null;
    private static Admin currentAdmin = null;


    public static void main(String[] args) {
        admins.add(new Admin("LeithEng", "Leith123"));
        while (true) {
            while (!isLoggedIn) {
                Login();
            }

            if (currentCustomer != null) {

                customerMenu();
            } else if (currentAdmin != null) {
                adminMenu();
            }


        }
    }


 //This is the function that handles the Login operation
    private static void Login() {
        System.out.println("Welcome to our e-commerce platform, dear user. In order to proceed, you have to log in");
        System.out.println("Do you already have an account?");
        System.out.println("1-Yes");
        System.out.println("2-No");
        int loginChoice;
        do {
            System.out.println("Please enter your choice:");
            loginChoice = scanner.nextInt();
            scanner.nextLine();

            switch (loginChoice) {
                case 1:
                    System.out.println("1-Normal User");
                    System.out.println("2-Admin");
                    System.out.println("Please enter your choice: ");
                    int AdminUser;
                    AdminUser = scanner.nextInt();
                    scanner.nextLine();
                    switch (AdminUser) {
                        case 1:
                            loginUser();
                            break;
                        case 2:
                            loginAdmin();
                            break;
                        default:
                            System.out.println("Invalid choice, please try again");

                    }

                    break;
                case 2:
                    System.out.println("Then in order to continue, you need to create an account");
                    createUserAccount();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (loginChoice != 2 && !isLoggedIn);
    }

    private static void loginUser() {//This function handles the login operation for normal users (customers)
        while (true) {
            System.out.println("Please enter your username: ");
            String username = scanner.nextLine();

            int index = -1;
            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).getUsername().equals(username)) {
                    index = i;
                    currentCustomer = customers.get(index);
                    break;
                }
            }

            if (index != -1) {
                while (true) {
                    System.out.println("Please enter your password: ");
                    String password = scanner.nextLine();

                    if (password.equals(currentCustomer.getPassword())) {
                        isLoggedIn = true;
                        System.out.println("Login successful");
                        return;
                    } else {
                        System.out.println("Invalid password, please try again");
                    }
                }
            } else {
                System.out.println("Invalid username, please try again.");
            }
        }
    }

    public static void loginAdmin() {//this function handles the login operation for admins
        System.out.println("Please enter your username: ");
        String username = scanner.nextLine();
        boolean exists = checkAdminUsername(username);
        if (!exists) {
            System.out.println("Invalid username, please try again.");
        } else {
            int maxAttempts = 3;
            int attempts = 0;
            while (attempts < maxAttempts) {
                System.out.println("Please enter your password: ");
                String password = scanner.nextLine();
                if (password.equals(currentAdmin.getPassword())) {
                    isLoggedIn = true;
                    System.out.println("Login successful!");
                    return;
                } else {
                    System.out.println("Invalid password. Attempts left: " + (maxAttempts - attempts - 1));
                }
                attempts++;
            }
            System.out.println("Too many failed attempts. Account locked.");
        }
    }

    private static boolean checkAdminUsername(String username) {
        for (int i = 0; i < admins.size(); i++) {
            if (admins.get(i).getUsername().equals(username)) {
                currentAdmin = admins.get(i);
                return true;
            }
        }
        return false;
    }

    private static void createUserAccount() {//This function allows customers to create an account if they don't have one, it's used in the login process
        System.out.println("Please enter a username: ");
        String us = scanner.nextLine();
        boolean exists = false;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getUsername().equals(us)) {
                exists = true;
            }

        }
        if (exists) {
            System.out.println("This username is already used, please give a new one");
        } else {
            System.out.println("Please enter a password: ");
            String pas = scanner.nextLine();
            Customer c = new Customer(us, pas, 0);
            customers.add(c);
            currentCustomer = c;
            isLoggedIn = true;


        }

    }


    public static void adminMenu() {//The admin menu, with the different functionalities available to admins
        while (true) {
            System.out.println("----Admin Menu----");
            System.out.println("1-Add a product to the inventory");
            System.out.println("2-Remove a product from the inventory");
            System.out.println("3-Apply a discount to a category of products");
            System.out.println("4-Add another user to the list of admins");
            System.out.println("5-Show the current inventory");
            System.out.println("6-Logout");
            System.out.println("7-Show all completed orders ");
            System.out.println("Please enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("What category does this product belong to?");
                    String cat = scanner.nextLine();
                    switch (cat) {
                        case "Electronics" -> {
                            inventory.AddElectronic();
                            System.out.println("Electronic product added successfully!");
                        }
                        case "Books" -> {
                            inventory.AddBook();
                            System.out.println("Book added successfully");
                        }
                        case "Clothes" -> {
                            inventory.AddClothes();
                            System.out.println("Clothing product added successfully");
                        }
                        case "Food" -> {
                            inventory.AddFood();
                            System.out.println("Product added successfully");
                        }
                        case "Furniture" -> {
                            inventory.AddFurniture();
                            System.out.println("Product added successfully");
                        }
                        case "Luxury" -> {
                            inventory.AddLuxury();
                            System.out.println("Product added successfully");
                        }
                        case "BeautyAndPersonalCare" -> {
                            inventory.AddBeauty();
                            System.out.println("Product added successfully");
                        }
                        default -> System.out.println("Invalid category");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter the name of the product to remove: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter the category of the product: ");
                    String cat = scanner.nextLine();
                    inventory.removeProduct(name, cat);
                    break;
                }
                case 3: {
                    System.out.println("Enter the amount of discount to apply  (int the form of 0.xxx):");
                    double discount = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter a category: ");
                    String cat = scanner.nextLine();
                    switch (cat) {
                        case "Electronics":
                            for (Electronics e : inventory.getElectronics()) {
                                double p = e.getPrice();
                                p = p - p * discount;
                                e.setPrice(p);
                                System.out.println("Discount applied to Electronics! ");
                            }
                            break;

                        case "Books":
                            for (Books b : inventory.getBooks()) {
                                double p = b.getPrice();
                                p = p - p * discount;
                                b.setPrice(p);
                                System.out.println("Discount applied to Books!");
                            }
                            break;
                        case "Clothes":
                            for (Clothes c : inventory.getClothes()) {
                                double p = c.getPrice();
                                p = p - p * discount;
                                c.setPrice(p);
                                System.out.println("Discount applied to Clothes!");
                            }
                            break;
                        case "Food":
                            for (Food f : inventory.getFood()) {
                                double p = f.getPrice();
                                p = p - p * discount;
                                f.setPrice(p);
                                System.out.println("Discount applied to Food!");
                            }
                            break;
                        case "Furniture":
                            for (Furniture fu : inventory.getFurnitures()) {
                                double p = fu.getPrice();
                                p = p - p * discount;
                                fu.setPrice(p);
                                System.out.println("Discount applied to Furniture!");
                            }
                            break;
                        case "Luxury":
                            for (Luxury l : inventory.getLuxuries()) {
                                double p = l.getPrice();
                                p = p - p * discount;
                                l.setPrice(p);
                                System.out.println("Discount applied to Luxury items!");
                            }
                            break;
                        case "BeautyAndPersonalCare":
                            for (BeautyAndPersonalCare bp : inventory.getBeautyProducts()) {
                                double p = bp.getPrice();
                                p = p - p * discount;
                                bp.setPrice(p);
                                System.out.println("Discount applied to Beauty and Personal Care products!");
                            }
                            break;
                        default:
                            System.out.println("Invalid category.");
                            break;
                    }
                    break;
                }
                case 4: {
                    System.out.println("Please enter a username: ");
                    String us = scanner.nextLine();
                    boolean exists = false;
                    for (Admin admin : admins) {
                        if (admin.getUsername().equals(us)) {
                            exists = true;
                            break;
                        }
                    }
                    if (exists) {
                        System.out.println("This username is already used, please give a new one");
                    } else {
                        System.out.println("Please enter a password: ");
                        String pas = scanner.nextLine();
                        Admin a = new Admin(us, pas);
                        admins.add(a);
                        System.out.println("New admin account added successfully!");

                    }
                    break;
                }
                case 5: {
                    System.out.println("Here's the full inventory");
                    inventory.ShowInventory();
                    break;
                }
                case 6: {
                    System.out.println("Goodbye, hope we'll see you soon!");
                    System.out.println("---------------------------------");
                    isLoggedIn = false;
                    currentAdmin = null;
                    return;
                }
                case 7:
                    for (Order o: completedOrders)
                    {o.ShowOrder();}
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    public static void customerMenu() {//The customer menu, with the different functionalities available to customers
        System.out.println("----Customer Menu----");
        System.out.println("1-Add a product to the shopping cart");
        System.out.println("2-Remove a product from the shopping cart");
        System.out.println("3-Display the products in your current shopping cart");
        System.out.println("4-Make an order");
        System.out.println("5-Show account info");
        System.out.println("6-Add an amount of money to your account's balance");
        System.out.println("7-Rate a product (out of 5)");
        System.out.println("8-Add feedback concerning a product");
        System.out.println("9-Show all the info concerning a product");
        System.out.println("10-Show users' feedback of a product");
        System.out.println("11-Empty your shopping cart");
        System.out.println("12-Change your password");
        System.out.println("13-Log out");
        System.out.println("Please enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1: {
                System.out.println("Please enter the product's name:");
                String name = scanner.nextLine();
                System.out.println("In order to provide better and more accurate search results, we ask you to provide the category the product belongs to");
                System.out.println("Please enter a category: ");
                String cat = scanner.nextLine();
                Product p = inventory.searchProduct(name, cat);
                if (p == null) {
                    System.out.println("Product not found");
                } else {
                    currentCustomer.AddToCart(p);
                }
                break;
            }
            case 2: {
                System.out.println("Please enter the name of the product you'd like to remove from the cart:");
                String n = scanner.nextLine();
                currentCustomer.RemoveFromCart(n);
                break;
            }
            case 3: {
                currentCustomer.ShowCart();
                break;
            }
            case 4: {
                System.out.println("Please enter the date on which you'd like your order to be completed:");
                String date = scanner.nextLine();
                Order o = new Order(date, currentCustomer, currentCustomer.TotalCartCost());
                completedOrders.add(o);
                o.CompleteOrder();
                break;
            }
            case 5: {
                currentCustomer.ShowUser();
                break;
            }
            case 6: {
                System.out.println("How much would you like to add to your account?");
                double a = scanner.nextDouble();
                scanner.nextLine();
                if (a < 0) {
                    System.out.println("Please give a valid amount");
                } else {
                    currentCustomer.AddBalance(a);
                    System.out.println(a + " dinars added to your account's balance. Enjoy your shopping!");
                }
                break;
            }
            case 7: {
                System.out.println("Please enter the product's name:");
                String name = scanner.nextLine();
                System.out.println("Please enter a category: ");
                String cat = scanner.nextLine();
                Product p = inventory.searchProduct(name, cat);
                if (p == null) {
                    System.out.println("Product not found");
                } else {
                    System.out.println("How much would you like to rate this product out of 5?:");
                    double r = scanner.nextDouble();
                    scanner.nextLine();
                    if (r < 0) {
                        System.out.println("You can't give a rating less than 0");
                    } else {
                        p.ratings.add(r);
                        System.out.println("Thank you for rating this product, your opinion is highly-valued");
                    }
                }
                break;
            }
            case 8: {
                System.out.println("Please enter the product's name:");
                String name = scanner.nextLine();
                System.out.println("Please enter a category: ");
                String cat = scanner.nextLine();
                Product p = inventory.searchProduct(name, cat);
                if (p == null) {
                    System.out.println("Product not found");
                } else {
                    currentCustomer.AddFeedback(p);
                    System.out.println("Feedback added successfully, thank you! Your opinion is highly-valued");
                }
            }
            break;

            case 9: {
                System.out.println("Please enter the product's name:");
                String name = scanner.nextLine();
                System.out.println("Please enter a category: ");
                String cat = scanner.nextLine();
                Product p = inventory.searchProduct(name, cat);
                if (p == null) {
                    System.out.println("Product not found");
                } else {
                    p.ShowProduct();
                }
                break;
            }
            case 10: {
                System.out.println("Please enter the product's name:");
                String name = scanner.nextLine();
                System.out.println("Please enter a category: ");
                String cat = scanner.nextLine();
                Product p = inventory.searchProduct(name, cat);
                if (p == null) {
                    System.out.println("Product not found");
                } else {
                    p.ShowFeedback();
                }
                break;


            }
            case 11: {
                currentCustomer.EmptyCart();
                break;
            }
            case 12: {
                System.out.println("Please enter a new password:");
                String pas = scanner.nextLine();
                while (pas.equals(currentCustomer.getPassword())) {
                    System.out.println("New password can't be the same as the old one");
                    System.out.println("Please enter a new password:");
                    pas = scanner.nextLine();
                }
                currentCustomer.setPassword(pas);
                System.out.println("Password changed successfully");
                break;

            }
            case 13: {
                System.out.println("We will miss you, please come back soon");
                isLoggedIn = false;
                currentCustomer = null;
                break;
            }
            default:
                System.out.println("Invalid choice");
        }
    }
}


