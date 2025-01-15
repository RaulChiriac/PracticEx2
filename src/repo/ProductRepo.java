package repo;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public Product getProductByName(String name) {
        return products.stream()
                .filter(product -> product.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    public void updateProduct(String name, Product updatedProduct) {
        Product product = getProductByName(name);
        if (product != null) {
            product.setName(updatedProduct.getName());
            product.setPrice(updatedProduct.getPrice());
            product.setHerkunfsregion(updatedProduct.getHerkunfsregion());
        }
    }

    public void deleteProduct(String name) {
        products.removeIf(product -> product.getName().equalsIgnoreCase(name));
    }
}
