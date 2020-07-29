package btquanlysanphamluuranhiphan;

import java.io.Serializable;

public class Product implements Serializable {
    private String productCode;
    private String name;
    private String brand;
    private double price;

    public Product() {
    }

    public Product(String productCode, String name, String brand, double price) {
        this.productCode = productCode;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public Product(String a, String bb, String ccc, String dddd, double v) {
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
