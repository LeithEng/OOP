import java.util.ArrayList;
import java.util.Scanner;
public class Inventory {
    Scanner scanner=new Scanner(System.in);
    private ArrayList<Electronics> electronics = new ArrayList<>();
    private ArrayList<Books> books = new ArrayList<>();
    private ArrayList<Luxury> luxuries = new ArrayList<>();
    private ArrayList<Furniture> furnitures = new ArrayList<>();
    private ArrayList<Food> food = new ArrayList<>();
    private ArrayList<Clothes> clothes = new ArrayList<>();
    private ArrayList<BeautyAndPersonalCare> BeautyProducts = new ArrayList<>();

    public void AddElectronic() {

        String name, type, brand, model;
        double price;
        int quantity;
        System.out.println("Please enter the product's name: ");
        name = scanner.nextLine();
        System.out.println("Please enter its type (laptop, smartphone...):");
        type = scanner.nextLine();
        System.out.println("Please enter its brand: ");
        brand = scanner.nextLine();
        System.out.println("Please enter the model's name: ");
        model = scanner.nextLine();
        System.out.println("Please enter the price (per unit): ");
        price = scanner.nextDouble();
        System.out.println("Please enter the quantity in stock: ");
        quantity = scanner.nextInt();
        Electronics e=new Electronics(name, price, quantity, type, brand, model);
        electronics.add(e);
    }

    public void AddBook() {
        String name, author, genre, date, format, language;
        double price;
        int pages, quantity;
        System.out.println("Please enter the book's name:");
        name = scanner.nextLine();
        System.out.println("Please enter the author's name: ");
        author = scanner.nextLine();
        System.out.println("Please enter the genre: ");
        genre = scanner.nextLine();
        System.out.println("Please enter its publication date:");
        date = scanner.nextLine();
        System.out.println("Please enter the book's format (Ebook, Hardcover...):");
        format = scanner.nextLine();
        System.out.println("Please enter the book's language:");
        language = scanner.nextLine();
        System.out.println("Please enter the number of pages");
        pages = scanner.nextInt();
        System.out.println("Please enter the price: ");
        price = scanner.nextDouble();
        System.out.println("Please enter the quantity in stock:");
        quantity = scanner.nextInt();
        Books b=new Books(name, price, quantity, author, genre, date, format, pages, language);
        books.add(b);
    }

    public void AddFurniture() {
        String name, manufacturer, material, dimensions, color;
        double weight, price;
        int quantity;
        System.out.println("Name:");
        name = scanner.nextLine();
        System.out.println("Manufacturer:");
        manufacturer = scanner.nextLine();
        System.out.println("Material:");
        material = scanner.nextLine();
        System.out.println("Dimensions:");
        dimensions = scanner.nextLine();
        System.out.println("Color:");
        color = scanner.nextLine();
        System.out.println("Weight:");
        weight = scanner.nextDouble();
        System.out.println("Price:");
        price = scanner.nextDouble();
        System.out.println("Quantity:");
        quantity = scanner.nextInt();
        Furniture f=new Furniture(name, price, quantity, manufacturer, material, dimensions, color, weight);
        furnitures.add(f);
    }

    public void AddLuxury() {
        String name, brand, type, main_material, size;
        double price;
        int quantity;
        System.out.println("Name:");
        name = scanner.nextLine();
        System.out.println("Brand:");
        brand = scanner.nextLine();
        System.out.println("Type:");
        type = scanner.nextLine();
        System.out.println("Main material:");
        main_material = scanner.nextLine();
        System.out.println("Size or length:");
        size = scanner.nextLine();
        System.out.println("Price:");
        price = scanner.nextDouble();
        System.out.println("Quantity:");
        quantity = scanner.nextInt();
        Luxury l=new Luxury(name, price, quantity, brand, type, main_material, size);
        luxuries.add(l);
    }

    public void AddFood() {
        String name, brand, type, expiry;
        double price, size;
        int quantity;
        System.out.println("Product name:");
        name = scanner.nextLine();
        System.out.println("Brand: ");
        brand = scanner.nextLine();
        System.out.println("Type (beverage, cereals...):");
        type = scanner.nextLine();
        System.out.println("Expiry date:");
        expiry = scanner.nextLine();
        System.out.println("Size/Volume:");
        size = scanner.nextDouble();
        System.out.println("Price: ");
        price = scanner.nextDouble();
        System.out.println("Quantity:");
        quantity = scanner.nextInt();
        Food f=new Food(name, price, quantity, brand, type, expiry, size);
        food.add(f);
    }

    public void AddClothes() {
        String name, brand, size, color, material, gender;
        int quantity;
        double price;
        System.out.println("Please enter the product's name:");
        name = scanner.nextLine();
        System.out.println("Please enter the brand:");
        brand = scanner.nextLine();
        System.out.println("Please enter the size:");
        size = scanner.nextLine();
        System.out.println("Please enter product's color:");
        color = scanner.nextLine();
        System.out.println("Please enter the material the product is made of:");
        material = scanner.nextLine();
        System.out.println("Is this product made for men or women?");
        gender = scanner.nextLine();
        System.out.println("Price: ");
        price = scanner.nextDouble();
        System.out.println("Quantity:");
        quantity = scanner.nextInt();
        Clothes c =new Clothes(name, price, quantity, brand, size, color, material, gender);
        clothes.add(c);
    }

    public void AddBeauty() {
        String name, brand, type, gender;
        double volume, price;
        int quantity;
        System.out.println("Name:");
        name = scanner.nextLine();
        System.out.println("Brand:");
        brand = scanner.nextLine();
        System.out.println("Type:");
        type = scanner.nextLine();
        System.out.println("Gender:");
        gender = scanner.nextLine();
        System.out.println("Volume or quantity:");
        volume = scanner.nextDouble();
        System.out.println("Price:");
        price = scanner.nextDouble();
        System.out.println("Quantity:");
        quantity = scanner.nextInt();
        BeautyAndPersonalCare b=new BeautyAndPersonalCare(name, price, quantity, brand, type, volume, gender);
        BeautyProducts.add(b);
    }

    public void ShowInventory() {
        System.out.println("------ Electronics ------");
        ShowElectronics();
        System.out.println("------ Books ------");
        ShowBooks();
        System.out.println("------ Luxuries ------");
        ShowLuxuries();
        System.out.println("------ Furnitures ------");
        ShowFurnitures();
        System.out.println("------ Food ------");
        ShowFood();
        System.out.println("------ Clothes ------");
        ShowClothes();
        System.out.println("------ Beauty Products ------");
        ShowBeautyProducts();


    }

    public void ShowElectronics() {
        System.out.println("------ Electronics ------");
        for (Electronics e : electronics) {
            e.ShowProduct();
            System.out.println();
        }
    }

    public void ShowBooks() {
        System.out.println("------ Books ------");
        for (Books b : books) {
            b.ShowProduct();
            System.out.println();
        }
    }

    public void ShowLuxuries() {
        System.out.println("------ Luxuries ------");
        for (Luxury l : luxuries) {
            l.ShowProduct();
            System.out.println();
        }
    }

    public void ShowFurnitures() {
        System.out.println("------ Furnitures ------");
        for (Furniture f : furnitures) {
            f.ShowProduct();
            System.out.println();
        }
    }

    public void ShowFood() {
        System.out.println("------ Food ------");
        for (Food f : food) {
            f.ShowProduct();
            System.out.println();
        }
    }

    public void ShowClothes() {
        System.out.println("------ Clothes ------");
        for (Clothes c : clothes) {
            c.ShowProduct();
            System.out.println();
        }
    }

    public void ShowBeautyProducts() {
        System.out.println("------ Beauty Products ------");
        for (BeautyAndPersonalCare b : BeautyProducts) {
            b.ShowProduct();
            System.out.println();
        }
    }

    public ArrayList<BeautyAndPersonalCare> getBeautyProducts() {
        return BeautyProducts;
    }

    public ArrayList<Books> getBooks() {
        return books;
    }

    public ArrayList<Clothes> getClothes() {
        return clothes;
    }

    public ArrayList<Electronics> getElectronics() {
        return electronics;
    }

    public ArrayList<Food> getFood() {
        return food;
    }

    public ArrayList<Furniture> getFurnitures() {
        return furnitures;
    }

    public ArrayList<Luxury> getLuxuries() {
        return luxuries;
    }

    public void removeProduct(String productName, String category) {
        switch (category) {
            case "Electronics":
                removeElectronic(productName);
                break;
            case "Books":
                removeBook(productName);
                break;
            case "Clothes":
                removeClothes(productName);
                break;
            case "Food":
                removeFood(productName);
                break;
            case "Furniture":
                removeFurniture(productName);
                break;
            case "Luxury":
                removeLuxury(productName);
                break;
            case "BeautyAndPersonalCare":
                removeBeautyAndPersonalCare(productName);
                break;
            default:
                System.out.println("Invalid category.");
                break;
        }
    }

    private void removeElectronic(String productName) {
        for (int i = 0; i < electronics.size(); i++) {
            if (electronics.get(i).getName().equals(productName)) {
                electronics.remove(i);
                System.out.println("Product removed successfully.");
                return;
            }
        }
        System.out.println("Product not found in Electronics category.");
    }

    private void removeClothes(String productName) {
        for (int i = 0; i < clothes.size(); i++) {
            if (clothes.get(i).getName().equals(productName)) {
                clothes.remove(i);
                System.out.println("Product removed successfully.");
                return;
            }
        }
        System.out.println("Product not found in Clothes category.");
    }

    private void removeFood(String productName) {
        for (int i = 0; i < food.size(); i++) {
            if (food.get(i).getName().equals(productName)) {
                food.remove(i);
                System.out.println("Product removed successfully.");
                return;
            }
        }
        System.out.println("Product not found in Food category.");
    }

    private void removeFurniture(String productName) {
        for (int i = 0; i < furnitures.size(); i++) {
            if (furnitures.get(i).getName().equals(productName)) {
                furnitures.remove(i);
                System.out.println("Product removed successfully.");
                return;
            }
        }
        System.out.println("Product not found in Furniture category.");
    }

    private void removeLuxury(String productName) {
        for (int i = 0; i < luxuries.size(); i++) {
            if (luxuries.get(i).getName().equals(productName)) {
                luxuries.remove(i);
                System.out.println("Product removed successfully.");
                return;
            }
        }
        System.out.println("Product not found in Luxury category.");
    }

    private void removeBeautyAndPersonalCare(String productName) {
        for (int i = 0; i < BeautyProducts.size(); i++) {
            if (BeautyProducts.get(i).getName().equals(productName)) {
                BeautyProducts.remove(i);
                System.out.println("Product removed successfully.");
                return;
            }
        }
        System.out.println("Product not found in Beauty and Personal Care category.");
    }

    private void removeBook(String productName) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(productName)) {
                books.remove(i);
                System.out.println("Product removed successfully.");
                return;
            }
        }
        System.out.println("Product not found in Books category.");
    }
    public Product searchProduct(String productName, String category) {
        switch (category) {
            case "Electronics":
                return searchElectronic(productName);
            case "Books":
                return searchBook(productName);
            case "Clothes":
                return searchClothes(productName);
            case "Food":
                return searchFood(productName);
            case "Furniture":
                return searchFurniture(productName);
            case "Luxury":
                return searchLuxury(productName);
            case "BeautyAndPersonalCare":
                return searchBeautyAndPersonalCare(productName);
            default:
                System.out.println("Invalid category.");
                return null;
        }
    }

    private Electronics searchElectronic(String productName) {
        for (Electronics e : electronics) {
            if (e.getName().equals(productName)) {
                return e;
            }
        }
        return null;
    }

    private Books searchBook(String productName) {
        for (Books b : books) {
            if (b.getName().equals(productName)) {
                return b;
            }
        }
        return null;
    }

    private Clothes searchClothes(String productName) {
        for (Clothes c : clothes) {
            if (c.getName().equals(productName)) {
                return c;
            }
        }
        return null;
    }

    private Food searchFood(String productName) {
        for (Food f : food) {
            if (f.getName().equals(productName)) {
                return f;
            }
        }
        return null;
    }

    private Furniture searchFurniture(String productName) {
        for (Furniture fu : furnitures) {
            if (fu.getName().equals(productName)) {
                return fu;
            }
        }
        return null;
    }

    private Luxury searchLuxury(String productName) {
        for (Luxury l : luxuries) {
            if (l.getName().equals(productName)) {
                return l;
            }
        }
        return null;
    }

    private BeautyAndPersonalCare searchBeautyAndPersonalCare(String productName) {
        for (BeautyAndPersonalCare bp : BeautyProducts) {
            if (bp.getName().equals(productName)) {
                return bp;
            }
        }
        return null;
    }




}
