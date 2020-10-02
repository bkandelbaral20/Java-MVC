package model;

import java.util.ArrayList;
import java.util.List;

public class ListPizza implements Pizzas {

//    creating arraylist for pizza
    private List<Pizza> pizzas = new ArrayList<>();

//    public ListPizza(){
//        createBurger(new pizza(""))
//    }

    @Override
    public Pizza findById(long id) {
        return null;
    }

    @Override
    public long createBurger(Pizza pizza) {
        return 0;
    }
}
