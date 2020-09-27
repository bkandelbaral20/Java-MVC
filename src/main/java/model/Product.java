package model;
import java.io.Serializable;

public class Product implements Serializable {

    //    instance variable properties
    private String name;
    private double price;

    //    default constructor
    public Product() {
    }

//constructor contains all the properties

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

//    getter and setter

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
}