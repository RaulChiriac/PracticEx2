package model;

import java.util.ArrayList;
import java.util.List;

public class Charaktere {
    int id;
    String name;
    String herkunfsort;
    List<Product> listProducts;

    public Charaktere(int id, String name, String herkunfsort) {
        this.id = id;
        this.name = name;
        this.herkunfsort = herkunfsort;
        this.listProducts = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHerkunfsort() {
        return herkunfsort;
    }

    public void setHerkunfsort(String herkunfsort) {
        this.herkunfsort = herkunfsort;
    }

    public List<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<Product> listProducts) {
        this.listProducts = listProducts;
    }
}
