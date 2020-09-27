package model;

import java.util.ArrayList;
import java.util.List;

    //DAO implementation
public class ListProducts implements Products {

    //creating array list of products
    private List<Product> products = new ArrayList();

    public ListProducts(){
        insert(new Product("hammer", 10));
        insert(new Product("drill",23));
    }

    @Override
    public List<Product> all() {
        return this.products;
    }

//    adding param product into the list of all products
    @Override
    public void insert(Product product) {
        this.products.add(product);
    }

}
