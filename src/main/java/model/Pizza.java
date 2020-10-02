package model;

import java.util.List;

public class Pizza {

    //    variables
    private long id;
    private String burgerName;


    //default constructor
    public Pizza() {
    }

    public Pizza(String burgerName) {
        this.burgerName = burgerName;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

}
