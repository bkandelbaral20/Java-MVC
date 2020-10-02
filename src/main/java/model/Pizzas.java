package model;

public interface Pizzas {
    Pizza findById(long id);

    long createBurger(Pizza pizza);
}
