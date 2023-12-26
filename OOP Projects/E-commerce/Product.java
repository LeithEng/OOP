import java.util.ArrayList;
public abstract class Product {
    private String name;
    private double price;
    private int quantity_in_stock;

    protected ArrayList <Double> ratings;
    protected ArrayList <String> feedback;
    Product(String name, double price, int quantity_in_stock)
    {this.name=name;
    this.price=price;
    this.quantity_in_stock=quantity_in_stock;
    ratings=new ArrayList<>();
    feedback=new ArrayList<>();}
    public void ShowProduct()
    {
        System.out.println("Product name: "+name);
        System.out.println("Price per unit: "+price);
        System.out.println("Quantity available: "+quantity_in_stock);
        double p=0;
        for (double d: ratings)
        {p+=d;}
        System.out.println("Average rating: "+(p/ratings.size()));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity_in_stock(int quantity_in_stock) {
        this.quantity_in_stock = quantity_in_stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity_in_stock() {
        return quantity_in_stock;
    }

    public void ShowFeedback()
    {
        for (String f : feedback)
        {
            System.out.println("-------------");
            System.out.println(f);
        }
    }
}

class Electronics extends Product
{private String type;
private String brand;
private String model;
Electronics(String name, double price, int quantity, String type, String brand, String model)
{
    super(name,price,quantity);
    this.brand=brand;
    this.model=model;
    this.type=type;
}

    @Override
    public void ShowProduct() {
        super.ShowProduct();
        System.out.println("Type of device: "+type);
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

}

class Clothes extends Product{
    private String brand;
    private String Size;
    private String color;
    private String material;
    private String gender;
    public Clothes(String name, double price, int quantity,String brand, String Size, String color, String material, String gender)
    {
        super(name,price,quantity);
        this.brand=brand;
        this.color=color;
        this.gender=gender;
        this.material=material;
        this.Size=Size;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getGender() {
        return gender;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return Size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(String size) {
        Size = size;
    }

    @Override
    public void ShowProduct() {
        super.ShowProduct();
        System.out.println("Brand: ");
        System.out.println("Size: ");
        System.out.println("Color: ");
        System.out.println("Material: ");
        System.out.println("Gender: ");
    }
}

class Furniture extends Product
{
    private String manufacturer;
    private String material;
    private String dimensions;
    private String color;
    private double weight;

    public Furniture(String name, double price, int quantity,String manufacturer,String material,String dimensions, String color, double weight)
    {
        super(name,price,quantity);
        this.color=color;
        this.dimensions=dimensions;
        this.manufacturer=manufacturer;
        this.material=material;
        this.weight=weight;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public String getDimensions() {
        return dimensions;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public void ShowProduct() {
        super.ShowProduct();
        System.out.println("Manufacturer: "+manufacturer);
        System.out.println("Material: "+material);
        System.out.println("Dimensions: "+dimensions);
        System.out.println("Color: "+color);
        System.out.println("Weight in Kg: "+weight);
    }
}

class Books extends Product{
    private String author;
    private String genre;
    private String publication_date;
    private String format;
    private int pages;
    private String language;
    public Books(String name, double price, int quantity,String author, String genre, String publication_date, String format, int pages, String language)
    {
        super(name,price,quantity);
        this.author=author;
        this.format=format;
        this.genre=genre;
        this.language=language;
        this.pages=pages;
        this.publication_date=publication_date;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPublication_date(String publication_date) {
        this.publication_date = publication_date;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getFormat() {
        return format;
    }

    public String getLanguage() {
        return language;
    }

    public String getPublication_date() {
        return publication_date;
    }

    @Override
    public void ShowProduct() {
        super.ShowProduct();
        System.out.println("Author: "+author);
        System.out.println("Genre: "+genre);
        System.out.println("Format: "+format);
        System.out.println("Number of pages: "+pages);
        System.out.println("Publication date: "+publication_date);
        System.out.println("Language: "+language);
    }
}

class Food extends Product{
    private String brand;
    private String type;
    private String Expiry_date;
    private double size;
    public Food(String name, double price, int quantity,String brand,String type, String Expiry_date, double size)
    {
        super(name,price,quantity);
        this.brand=brand;
        this.size=size;
        this.Expiry_date=Expiry_date;
        this.type=type;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setExpiry_date(String expiry_date) {
        Expiry_date = expiry_date;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public double getSize() {
        return size;
    }

    public String getExpiry_date() {
        return Expiry_date;
    }

    @Override
    public void ShowProduct() {
        super.ShowProduct();
        System.out.println("Brand: "+brand);
        System.out.println("Type: "+type);
        System.out.println("Expiry date: "+Expiry_date);
        System.out.println("Size or weight: "+size);
    }
}

class BeautyAndPersonalCare extends Product
{
    private String brand;
    private String type;
    private double volume;
    private String gender;
    public BeautyAndPersonalCare(String name, double price, int quantity,String brand, String type, double volume, String gender)
    {
        super(name,price,quantity);
        this.brand=brand;
        this.volume=volume;
        this.type=type;
        this.gender=gender;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getGender() {
        return gender;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void ShowProduct() {
        super.ShowProduct();
        System.out.println("Brand: "+brand);
        System.out.println("Product type: "+type);
        System.out.println("Volume or quantity: "+volume);
        System.out.println("Gender: "+gender);
    }
}

class Luxury extends Product{
    private String brand;
    private String type;
    private String main_material;
    private String size;

    public Luxury(String name, double price, int quantity,String brand, String type, String main_material,String size)
    {
        super(name,price,quantity);
        this.brand=brand;
        this.type=type;
        this.main_material=main_material;
        this.size=size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMain_material(String main_material) {
        this.main_material = main_material;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public String getMain_material() {
        return main_material;
    }

    @Override
    public void ShowProduct() {
        super.ShowProduct();
        System.out.println("Brand: "+brand);
        System.out.println("Type: "+type);
        System.out.println("Main material: "+main_material);
        System.out.println("Size or length: "+size);
    }
}

