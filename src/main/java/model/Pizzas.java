package model;

public interface Pizzas {
    Pizza findById(long id);

    void  createBurger(Pizza pizza);
}
