import java.util.*;
class Product 
{
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) 
    {
        this.name = name.toLowerCase(); 
        this.category = category.toLowerCase();
        this.price = price;
    }

    public String getName() 
    {
        return name;
    }

    public String getCategory() 
    {
        return category;
    }

    public double getPrice() 
    {
        return price;
    }

    public void display() 
    {
        System.out.println("Product: " + name + ", Category: " + category + ", Price: ₹" + price);
    }
}
class ProductSearch 
{
    private List<Product> products;
    public ProductSearch(List<Product> products) 
    {
        this.products = products;
    }
    public void searchByName(String keyword) 
    {
        System.out.println("Search results for: " + keyword);
        boolean found = false;
        for (Product p : products) 
        {
            if (p.getName().contains(keyword.toLowerCase())) 
            {
                p.display();
                found = true;
            }
        }
        if (!found) 
        {
            System.out.println("No products found.");
        }
    }
    public void searchByCategory(String category) 
    {
        System.out.println("Products in category: " + category);
        boolean found = false;
        for (Product p : products) 
        {
            if (p.getCategory().equals(category.toLowerCase())) 
            {
                p.display();
                found = true;
            }
        }
        if (!found) 
        {
            System.out.println("No products found in this category.");
        }
    }
}
public class ECommerceSearch 
{
    public static void main(String[] args) 
    {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("iPhone 15", "Electronics", 79999));
        productList.add(new Product("Samsung Galaxy", "Electronics", 69999));
        productList.add(new Product("Nike Running Shoes", "Footwear", 4999));
        productList.add(new Product("Leather Wallet", "Accessories", 999));

        ProductSearch search = new ProductSearch(productList);
        search.searchByName("iPhone");
        System.out.println();
        search.searchByCategory("Footwear");
    }
}
