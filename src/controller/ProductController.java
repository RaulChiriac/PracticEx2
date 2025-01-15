package controller;

import model.Product;
import repo.ProductRepo;

import java.util.List;

public class ProductController {
    private ProductRepo productRepo;

    public ProductController(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public void addProduct(Product product) {
        productRepo.addProduct(product);
    }

    public List<Product> getAllProducts() {
        return productRepo.getProducts();
    }

    public Product getProductByName(String name) {
        return productRepo.getProductByName(name);
    }

    public void updateProduct(String name, Product updatedProduct) {
        productRepo.updateProduct(name, updatedProduct);
    }

    public void deleteProduct(String name) {
        productRepo.deleteProduct(name);
    }
}
