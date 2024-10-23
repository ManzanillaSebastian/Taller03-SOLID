package SeccionB;

import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double calculateTotalPrice() {
        double total = 0;
        // Lógica para calcular el precio total
        return total;
    }
    /*
    public void sendReceipt() {
        System.out.println("Sending receipt by email...");
        // Lógica para enviar el recibo
    }*/
}

public class Cashier {
    public void sendReceipt(ShoppingCart sc){
        //Lógica para enviar el recibo
    }
}

public abstract class Product implements IvaCalculatable{
    private String name;
    private double price;
    private String type;

    public Product(String name, double price, String type) {
        // Constructor
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
    @Override
    public double calculateIva(){
        return price * 0.12;
    }
}

public class DigitalProduct extends Product {
    public DigitalProduct(String name, double price) {
        super(name, price, "digital");
    }
}

public class WeightedProduct extends Product implements IvaCalculatable{
    private double weight;
    public WeightedProduct(String name, double price, double weight){
        super(name, price, "weighted");
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    @Override
    public double calculateIva(){
        return getPrice() * weight * 0.12;
    }
}

public class IvaCalculator {
    public double calculateIVA(Product p) {
        double iva = p.calculateIva();
        return iva;
    }
}

public interface IvaCalculatable{
    public double calculateIva();
}
