package model;

import java.util.ArrayList;
import java.util.List;

public class ListPizza implements Pizzas {

//    creating arraylist for pizza
    private List<Pizza> pizzas = new ArrayList<>();

//    creating pizza list
    public ListPizza(){
        createBurger(new Pizza("cheese"));
    }

    @Override
    public Pizza findById(long id) {
        return pizzas.get((int)id - 1);
    }

    @Override
    public void createBurger(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    @Override
    public List<Pizza> all() {
        return this.pizzas;
    }
}
