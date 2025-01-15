package model;

public class Product {
    String name;
    double price;
    String herkunfsregion;

    public Product(String name, double price, String herkunfsregion) {
        this.name = name;
        this.price = price;
        this.herkunfsregion = herkunfsregion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getHerkunfsregion() {
        return herkunfsregion;
    }

    public void setHerkunfsregion(String herkunfsregion) {
        herkunfsregion = herkunfsregion;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + '\'' + ", price=" + price + ", herkunfsregion='" + herkunfsregion + '\'' + '}';
    }
}
