package model;

import java.util.List;

public class Pizza {

    //    variables
    private long id;
    private String PizzaName;


    //default constructor
    public Pizza() {
    }

    public Pizza(String PizzaName) {
        this.PizzaName = PizzaName;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPizzaName() {
        return PizzaName;
    }

    public void setPizzaName(String pizzaName) {
        PizzaName = pizzaName;
    }
}
